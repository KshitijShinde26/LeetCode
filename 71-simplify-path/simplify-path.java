class Solution {
    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();

        String[] parts = path.split("/");

        for (String part : parts) {

            // Ignore empty strings and "."
            if (part.equals("") || part.equals(".")) {
                continue;
            }

            // Go to parent directory
            else if (part.equals("..")) {

                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }

            // Normal directory/file name
            else {
                stack.push(part);
            }
        }

        // Build final path
        StringBuilder result = new StringBuilder();

        for (String dir : stack) {
            result.append("/").append(dir);
        }

        // If stack is empty, we are at root
        if (result.length() == 0) {
            return "/";
        }

        return result.toString();
    }
}
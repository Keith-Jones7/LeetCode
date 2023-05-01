package Exercises.Second_Medium;
//427 建立四叉树
public class construct_quad_tree {
    private class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;


        public Node() {
            this.val = false;
            this.isLeaf = false;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }
    }

    public Node construct(int[][] grid) {
        return splitGrid(grid, 0, grid.length, 0, grid.length);
    }

    public Node splitGrid(int[][] grid, int row_start, int row_end, int col_start, int col_end) {
        if(row_start == row_end && col_start == col_end) {
            return null;
        }
        if(isLeaf(grid, row_start, row_end, col_start, col_end)) {
            return new Node(grid[row_start][col_start] == 1, true);
        }
        Node node = new Node(false, false);
        System.out.println(row_start + "  " + row_end + "  " + col_start + "  " + col_end);
        node.topLeft = splitGrid(grid, row_start, (row_end + row_start) / 2, col_start, (col_end + col_start) / 2);
        node.topRight = splitGrid(grid, row_start, (row_end + row_start) / 2, (col_end + col_start) / 2, col_end);
        node.bottomLeft = splitGrid(grid, (row_end + row_start) / 2, row_end, col_start, (col_end + col_start) / 2);
        node.bottomRight = splitGrid(grid, (row_end + row_start) / 2, row_end, (col_end + col_start) / 2, col_end);
        return node;
    }
    public boolean isLeaf(int[][] grid, int row_start, int row_end, int col_start, int col_end) {
        int val = grid[row_start][col_start];
        for(int i = row_start; i < row_end; i++) {
            for (int j = col_start; j < col_end; j++) {
                if(val != grid[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}


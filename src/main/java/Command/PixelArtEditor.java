package Command;

public class PixelArtEditor {
    private boolean[][] grid;
    private int cursorX;
    private int cursorY;

    public PixelArtEditor() {
        this.grid = new boolean[8][8];
        this.cursorX = 0;
        this.cursorY = 0;
    }

    public void moveCursorUp() {
        if (cursorY > 0) {
            cursorY--;
        }
    }

    public void moveCursorDown() {
        if (cursorY < grid.length - 1) {
            cursorY++;
        }
    }

    public void moveCursorLeft() {
        if (cursorX > 0) {
            cursorX--;
        }
    }

    public void moveCursorRight() {
        if (cursorX < grid[0].length - 1) {
            cursorX++;
        }
    }

    public void togglePixel() {
        grid[cursorY][cursorX] = !grid[cursorY][cursorX];
    }

    public void generateCode() {
        System.out.println("int[][] pixelArt = {");
        for (int y = 0; y < grid.length; y++) {
            System.out.print("    {");
            for (int x = 0; x < grid[y].length; x++) {
                System.out.print(grid[y][x] ? "1" : "0");
                if (x < grid[y].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("},");
        }
        System.out.println("};");
    }
}
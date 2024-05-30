package com.kosta.exam100;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OmokGame extends JFrame {
    private static final int BOARD_SIZE = 19; // 19x19 보드 크기
    private static final int CELL_SIZE = 30; // 셀 크기를 줄여서 19x19 보드가 화면에 맞도록 조정
    private static final int STONE_SIZE = CELL_SIZE - 10;
    private char[][] board;
    private boolean isBlackTurn;

    public OmokGame() {
        setTitle("Omok Game");
        setSize(BOARD_SIZE * CELL_SIZE + 50, BOARD_SIZE * CELL_SIZE + 70);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board = new char[BOARD_SIZE][BOARD_SIZE];
        isBlackTurn = true;

        JPanel boardPanel = new BoardPanel();
        boardPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX() / CELL_SIZE;
                int y = e.getY() / CELL_SIZE;
                if (x >= BOARD_SIZE || y >= BOARD_SIZE || board[x][y] != '\0') {
                    return;
                }
                if (is33Forbidden(x, y, isBlackTurn ? 'B' : 'W')) {
                    JOptionPane.showMessageDialog(null, "33 is not allowed!");
                    return;
                }
                board[x][y] = isBlackTurn ? 'B' : 'W';
                if (checkWin(x, y)) {
                    String winner = isBlackTurn ? "Black" : "White";
                    JOptionPane.showMessageDialog(null, winner + " wins!");
                    resetBoard();
                } else {
                    isBlackTurn = !isBlackTurn;
                }
                repaint();
            }
        });

        add(boardPanel, BorderLayout.CENTER);
    }

    private void resetBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = '\0';
            }
        }
        isBlackTurn = true;
        repaint();
    }

    private boolean checkWin(int x, int y) {
        char stone = board[x][y];
        return checkDirection(x, y, 1, 0, stone) || // Horizontal
               checkDirection(x, y, 0, 1, stone) || // Vertical
               checkDirection(x, y, 1, 1, stone) || // Diagonal \
               checkDirection(x, y, 1, -1, stone);  // Diagonal /
    }

    private boolean checkDirection(int x, int y, int dx, int dy, char stone) {
        int count = 1;
        int nx = x, ny = y;

        for (int i = 0; i < 4; i++) {
            nx += dx;
            ny += dy;
            if (nx >= 0 && ny >= 0 && nx < BOARD_SIZE && ny < BOARD_SIZE && board[nx][ny] == stone) {
                count++;
            } else {
                break;
            }
        }

        nx = x;
        ny = y;

        for (int i = 0; i < 4; i++) {
            nx -= dx;
            ny -= dy;
            if (nx >= 0 && ny >= 0 && nx < BOARD_SIZE && ny < BOARD_SIZE && board[nx][ny] == stone) {
                count++;
            } else {
                break;
            }
        }

        return count >= 5;
    }

    private boolean is33Forbidden(int x, int y, char stone) {
        int openThreeCount = 0;
        if (isOpenThree(x, y, 1, 0, stone)) openThreeCount++; // Horizontal
        if (isOpenThree(x, y, 0, 1, stone)) openThreeCount++; // Vertical
        if (isOpenThree(x, y, 1, 1, stone)) openThreeCount++; // Diagonal \
        if (isOpenThree(x, y, 1, -1, stone)) openThreeCount++; // Diagonal /
        return openThreeCount >= 2;
    }

    private boolean isOpenThree(int x, int y, int dx, int dy, char stone) {
        int count = 1;
        int nx = x, ny = y;
        boolean openStart = false, openEnd = false;

        // Check forward
        for (int i = 0; i < 3; i++) {
            nx += dx;
            ny += dy;
            if (nx >= 0 && ny >= 0 && nx < BOARD_SIZE && ny < BOARD_SIZE) {
                if (board[nx][ny] == stone) {
                    count++;
                } else if (board[nx][ny] == '\0') {
                    openEnd = true;
                    break;
                } else {
                    break;
                }
            }
        }

        nx = x;
        ny = y;

        // Check backward
        for (int i = 0; i < 3; i++) {
            nx -= dx;
            ny -= dy;
            if (nx >= 0 && ny >= 0 && nx < BOARD_SIZE && ny < BOARD_SIZE) {
                if (board[nx][ny] == stone) {
                    count++;
                } else if (board[nx][ny] == '\0') {
                    openStart = true;
                    break;
                } else {
                    break;
                }
            }
        }

        return count == 3 && openStart && openEnd;
    }

    private class BoardPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (int i = 0; i < BOARD_SIZE; i++) {
                for (int j = 0; j < BOARD_SIZE; j++) {
                    g.setColor(Color.BLACK);
                    g.drawRect(i * CELL_SIZE, j * CELL_SIZE, CELL_SIZE, CELL_SIZE);
                    if (board[i][j] == 'B') {
                        g.setColor(Color.BLACK);
                        g.fillOval(i * CELL_SIZE + 5, j * CELL_SIZE + 5, STONE_SIZE, STONE_SIZE);
                    } else if (board[i][j] == 'W') {
                        g.setColor(Color.WHITE);
                        g.fillOval(i * CELL_SIZE + 5, j * CELL_SIZE + 5, STONE_SIZE, STONE_SIZE);
                        g.setColor(Color.BLACK);
                        g.drawOval(i * CELL_SIZE + 5, j * CELL_SIZE + 5, STONE_SIZE, STONE_SIZE);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            OmokGame game = new OmokGame();
            game.setVisible(true);
        });
    }
}

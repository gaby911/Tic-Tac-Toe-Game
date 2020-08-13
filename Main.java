package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // #################STAGE 1 ######################

//        System.out.println("X O X\n" +
//                "O X O\n" +
//                "X X O ");

        // #################STAGE 2 ######################

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter cells: " );
//        String symbols = sc.next();
//
//        char [] symbolsIntoChar = symbols.toCharArray();
//
//
//        System.out.println("---------");
//        for (int i=0;i<9;i=i+3){
//            System.out.println("| "+symbolsIntoChar[i] + " " +symbolsIntoChar[i+1] +" " +symbolsIntoChar[i+2] +" |");
//        }
//        System.out.println("---------");

        // #################STAGE 3 ######################

        /*Scanner scanner = new Scanner(System.in);
        String[][] tictactoe = new String[3][3];


        //init method
        System.out.print("Enter cells: ");
        String s = scanner.next();

        String a = s.substring(0, 1);
        tictactoe[0][0] = a;
        String b = s.substring(1, 2);
        tictactoe[0][1] = b;
        String c = s.substring(2, 3);
        tictactoe[0][2] = c;
        String d = s.substring(3, 4);
        tictactoe[1][0] = d;
        String e = s.substring(4, 5);
        tictactoe[1][1] = e;
        String f = s.substring(5, 6);
        tictactoe[1][2] = f;
        String g = s.substring(6, 7);
        tictactoe[2][0] = g;
        String h = s.substring(7, 8);
        tictactoe[2][1] = h;
        String i = s.substring(8, 9);
        tictactoe[2][2] = i;
        System.out.println("---------");
        System.out.println("| " + tictactoe[0][0] + " " + tictactoe[0][1] + " " + tictactoe[0][2] + " |");
        System.out.println("| " + tictactoe[1][0] + " " + tictactoe[1][1] + " " + tictactoe[1][2] + " |");
        System.out.println("| " + tictactoe[2][0] + " " + tictactoe[2][1] + " " + tictactoe[2][2] + " |");
        System.out.println("---------");

        String letter = null;
        int countX=0;
        int countO=0;
        int emptySpace=0;
        int winX=0;
        int winO=0;

        //Fill the tictactoe matrix and count how many Xs Os and spaces I have
        for (int n = 0; n < 3; n++) {
            for (int m = 0; m < 3; m++) {
                letter = tictactoe[n][m];

                if (letter.equals("X")) {
                    countX++;
                } else if (letter.equals("O")) {
                    countO++;
                }
                if (letter.equals(" ") || letter.equals("_")) {
                    emptySpace++;
                }
            }
        }

        //Check who wins and count each win

        for (int k = 0; k < 3; k++) {
            if ((tictactoe[k][0]).equals(tictactoe[k][1]) && (tictactoe[k][0]).equals(tictactoe[k][2])) {

                if (tictactoe[k][0].equals("X")) {
                    winX++;
                } else if (tictactoe[k][0].equals("O")) {
                    {
                        winO++;
                    }
//                System.out.print("orizontala"+winX);

                }
            }

            if ((tictactoe[0][k]).equals(tictactoe[1][k]) && (tictactoe[0][k]).equals(tictactoe[2][k])) {

                if (tictactoe[0][k].equals("X")) {
                    winX++;
                } else if (tictactoe[0][k].equals("O")) {
                    {
                        winO++;
                    }
//                    System.out.print("verticala"+winX);
                }
            }



        }

        if ((tictactoe[0][0]).equals(tictactoe[1][1]) && (tictactoe[0][0]).equals(tictactoe[2][2])) {

            if (tictactoe[0][0].equals("X")) {
                winX++;
            } else if (tictactoe[0][0].equals("O")) {
                winO++;
            }
//            System.out.print("diagonala principala"+winX);
        }


        if ((tictactoe[2][0]).equals(tictactoe[1][1]) && (tictactoe[2][0]).equals(tictactoe[0][2])) {

            if (tictactoe[2][0].equals("X")) {
                winX++;
            } else if (tictactoe[2][0].equals("O")) {

                winO++;
            }
//            System.out.print("diagonala secundara"+winX);
        }

        // check the game
        if ((winO == 1 && winX == 1) || (countX - countO > 1 || countO - countX > 1)) {
            System.out.println("Impossible");

        }else if(emptySpace>0 && winO==0&&winX==0){
            System.out.println("Game not finished");
        }

        if(winX ==0 && winO==0 && (countX - countO == 1 || countO - countX == 1)){
            System.out.println("Draw");
        }

        if(winX>=1 && winO==0 && (countX - countO >= 0)){
            System.out.println(" X wins");
        }else if (winO >= 1 && winX==0 && (countO - countX >= 0)) {
            System.out.println(" O wins");
        }
*/

//        System.out.println(winX);
//        System.out.println(winO);
//        System.out.println(countX);
//        System.out.println(countO);

        // #################STAGE 4 ######################

       /*
       Scanner scanner = new Scanner(System.in);
        String[][] tictactoe = new String[3][3];


        //init method
        System.out.print("Enter cells: ");
        String s = scanner.next();


        String a = s.substring(0, 1);
        tictactoe[0][0] = a;
        String b = s.substring(1, 2);
        tictactoe[0][1] = b;
        String c = s.substring(2, 3);
        tictactoe[0][2] = c;
        String d = s.substring(3, 4);
        tictactoe[1][0] = d;
        String e = s.substring(4, 5);
        tictactoe[1][1] = e;
        String f = s.substring(5, 6);
        tictactoe[1][2] = f;
        String g = s.substring(6, 7);
        tictactoe[2][0] = g;
        String h = s.substring(7, 8);
        tictactoe[2][1] = h;
        String i = s.substring(8, 9);
        tictactoe[2][2] = i;

        for (int n = 0; n < 3; n++) {
            for (int m = 0; m < 3; m++) {
                String cuv = tictactoe[n][m];
                if (cuv.equals("_")) {
                    tictactoe[n][m] =" ";
                }
            }
        }

                System.out.println("---------");
        System.out.println("| " + tictactoe[0][0] + " " + tictactoe[0][1] + " " + tictactoe[0][2] + " |");
        System.out.println("| " + tictactoe[1][0] + " " + tictactoe[1][1] + " " + tictactoe[1][2] + " |");
        System.out.println("| " + tictactoe[2][0] + " " + tictactoe[2][1] + " " + tictactoe[2][2] + " |");
        System.out.println("---------");

        String player1 = "X";
        String letter;
        boolean correctCoordinate=false;
        Scanner sc = new Scanner(System.in);
        while (!correctCoordinate){
            System.out.print("Enter the coordinates: ");

            String input=sc.nextLine();

            String [] pieces = input.split("\\s+");


            int x=0;
            int y=0;

            try {

                x = Integer.parseInt(pieces[0]);
                y = Integer.parseInt(pieces[1]);

                letter = tictactoe[3-y][x-1];

                if (letter.equals("X") || letter.equals("O")) {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    tictactoe[3-y][x-1]=player1;
                    System.out.println("---------");
                    System.out.println("| " + tictactoe[0][0] + " " + tictactoe[0][1] + " " + tictactoe[0][2] + " |");
                    System.out.println("| " + tictactoe[1][0] + " " + tictactoe[1][1] + " " + tictactoe[1][2] + " |");
                    System.out.println("| " + tictactoe[2][0] + " " + tictactoe[2][1] + " " + tictactoe[2][2] + " |");
                    System.out.println("---------");
                    correctCoordinate=true;
                }

            }catch (NumberFormatException err1) {
//                err1.printStackTrace();
                System.out.println("You should enter numbers!");

            }catch (ArrayIndexOutOfBoundsException err2){
                System.out.println("Coordinates should be from 1 to 3!");
            }

        }

        */

        // #################STAGE 5 ######################


        String[][] tictactoe = new String[3][3];
        boolean gameFinished = false;


        String s = "         ";


        String a = s.substring(0, 1);
        tictactoe[0][0] = a;
        String b = s.substring(1, 2);
        tictactoe[0][1] = b;
        String c = s.substring(2, 3);
        tictactoe[0][2] = c;
        String d = s.substring(3, 4);
        tictactoe[1][0] = d;
        String e = s.substring(4, 5);
        tictactoe[1][1] = e;
        String f = s.substring(5, 6);
        tictactoe[1][2] = f;
        String g = s.substring(6, 7);
        tictactoe[2][0] = g;
        String h = s.substring(7, 8);
        tictactoe[2][1] = h;
        String i = s.substring(8, 9);
        tictactoe[2][2] = i;

        System.out.println("---------");
        System.out.println("| " + tictactoe[0][0] + " " + tictactoe[0][1] + " " + tictactoe[0][2] + " |");
        System.out.println("| " + tictactoe[1][0] + " " + tictactoe[1][1] + " " + tictactoe[1][2] + " |");
        System.out.println("| " + tictactoe[2][0] + " " + tictactoe[2][1] + " " + tictactoe[2][2] + " |");
        System.out.println("---------");
        int counter = 0;
        while (!gameFinished) {


            String player1 = "X";
            String player2 = "O";
            String letter;

            boolean correctCoordinate = false;

            Scanner sc = new Scanner(System.in);

            while (!correctCoordinate) {
                System.out.print("Enter the coordinates: ");

                String input = sc.nextLine();

                String[] pieces = input.split("\\s+");


                int x = 0;
                int y = 0;

                try {

                    x = Integer.parseInt(pieces[0]);
                    y = Integer.parseInt(pieces[1]);

                    letter = tictactoe[3 - y][x - 1];

                    if (letter.equals("X") || letter.equals("O")) {
                        System.out.println("This cell is occupied! Choose another one!");
                    }else if (counter % 2 ==0) {

                            tictactoe[3 - y][x - 1] = player1;
                            System.out.println("---------");
                            System.out.println("| " + tictactoe[0][0] + " " + tictactoe[0][1] + " " + tictactoe[0][2] + " |");
                            System.out.println("| " + tictactoe[1][0] + " " + tictactoe[1][1] + " " + tictactoe[1][2] + " |");
                            System.out.println("| " + tictactoe[2][0] + " " + tictactoe[2][1] + " " + tictactoe[2][2] + " |");
                            System.out.println("---------");
                            correctCoordinate = true;
                            counter++;

                        }else {

                            tictactoe[3 - y][x - 1] = player2;
                            System.out.println("---------");
                            System.out.println("| " + tictactoe[0][0] + " " + tictactoe[0][1] + " " + tictactoe[0][2] + " |");
                            System.out.println("| " + tictactoe[1][0] + " " + tictactoe[1][1] + " " + tictactoe[1][2] + " |");
                            System.out.println("| " + tictactoe[2][0] + " " + tictactoe[2][1] + " " + tictactoe[2][2] + " |");
                            System.out.println("---------");
                            correctCoordinate = true;
                            counter++;

                        }



                } catch (NumberFormatException err1) {
//                err1.printStackTrace();
                    System.out.println("You should enter numbers!");

                } catch (ArrayIndexOutOfBoundsException err2) {
                    System.out.println("Coordinates should be from 1 to 3!");
                }

            }
            correctCoordinate=false;

            String letter2 = null;
            int countX = 0;
            int countO = 0;
            int emptySpace = 0;
            int winX = 0;
            int winO = 0;

            //Fill the tictactoe matrix and count how many Xs Os and spaces I have
            for (int n = 0; n < 3; n++) {
                for (int m = 0; m < 3; m++) {
                    letter2 = tictactoe[n][m];

                    if (letter2.equals("X")) {
                        countX++;
                    } else if (letter2.equals("O")) {
                        countO++;
                    }
                    if (letter2.equals(" ") || letter2.equals("_")) {
                        emptySpace++;
                    }
                }
            }

            //Check who wins and count each win

            for (int k = 0; k < 3; k++) {
                if ((tictactoe[k][0]).equals(tictactoe[k][1]) && (tictactoe[k][0]).equals(tictactoe[k][2])) {

                    if (tictactoe[k][0].equals("X")) {
                        winX++;
                    } else if (tictactoe[k][0].equals("O")) {
                        {
                            winO++;
                        }


                    }
                }

                if ((tictactoe[0][k]).equals(tictactoe[1][k]) && (tictactoe[0][k]).equals(tictactoe[2][k])) {

                    if (tictactoe[0][k].equals("X")) {
                        winX++;
                    } else if (tictactoe[0][k].equals("O")) {
                        {
                            winO++;
                        }

                    }
                }


            }

            if ((tictactoe[0][0]).equals(tictactoe[1][1]) && (tictactoe[0][0]).equals(tictactoe[2][2])) {

                if (tictactoe[0][0].equals("X")) {
                    winX++;
                } else if (tictactoe[0][0].equals("O")) {
                    winO++;
                }

            }


            if ((tictactoe[2][0]).equals(tictactoe[1][1]) && (tictactoe[2][0]).equals(tictactoe[0][2])) {

                if (tictactoe[2][0].equals("X")) {
                    winX++;
                } else if (tictactoe[2][0].equals("O")) {

                    winO++;
                }

            }

            // check the game
//            if ((winO == 1 && winX == 1) || (countX - countO > 1 || countO - countX > 1)) {
//                System.out.println("Impossible");
//            }
//            else if (emptySpace > 0 && winO == 0 && winX == 0) {
//                System.out.println("Game not finished");
//            }

            if ((winX == 0 && winO == 0) && (countX - countO == 1 || countO - countX == 1) && emptySpace==0) {
                System.out.println("Draw");
                gameFinished=true;
            }

            if (winX >= 1 && winO == 0 && (countX - countO >= 0)) {
                System.out.println(" X wins");
                gameFinished=true;
            } else if (winO >= 1 && winX == 0 && (countO - countX >= 0)) {
                System.out.println(" O wins");
                gameFinished=true;
            }
        }
    }
}

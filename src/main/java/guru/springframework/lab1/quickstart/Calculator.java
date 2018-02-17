package guru.springframework.lab1.quickstart;

/*
* Calculator class. Operations + - * /
* Switch between integer and double mode via setThisMode.
*
* */

public class Calculator {

        private static boolean doubleMode_ = false;

        public static void setDoubleMode(){doubleMode_ = true;}
        public static void setIntegerMode(){doubleMode_ = false;}


        public static int add (int x, int y) throws Exception
        {
            if (doubleMode_) throw new Exception("Wrong mode selected: try add(double)");
            return x + y;
        }


        public static int sub (int x, int y) throws Exception
        {
            if (doubleMode_) throw new Exception("Wrong mode selected: try sub(double)");
            return x - y;
        }


        public static int div (int x, int y) throws Exception
        {
            if (doubleMode_) throw new Exception("Wrong mode selected: try div(double)");
            return x / y;
        }


        public static int mult (int x, int y) throws Exception
        {
            if (doubleMode_) throw new Exception("Wrong mode selected: try mult(double)");
            return x * y;
        }


        public static double add (double x, double y) throws Exception
        {
            if (!doubleMode_) throw new Exception("Wrong mode selected: try add(int)");
            return x + y;
        }


        public static double sub (double x, double y) throws Exception
        {
            if (!doubleMode_) throw new Exception("Wrong mode selected: try sub(int)");
            return x - y;
        }


        public static double div (double x, double y) throws Exception
        {
            if (!doubleMode_) throw new Exception("Wrong mode selected: try div(int)");
            return x / y;
        }


        public static double mult (double x, double y) throws Exception
        {
            if (!doubleMode_) throw new Exception("Wrong mode selected: try mult(int)");
            return x * y;
        }
}

class cal {     // child
            public int cal_add(int x, int y) {
                return x + y;
            }
        }
        class cal1 extends cal {     // parent class
            public int cal_sub(int x, int y) {
                return x - y;
            }


        }

        class inherit {
            public static void main(String[] args) {
                cal1 c = new cal1();
                c.cal_sub(5,2);
            }
        }


package Prox;

public class Server implements Block {
    private int dataBase;

        public Server(int dataBase) {
            this.dataBase = dataBase;
        }

        public int getDataBase() {
            return dataBase;
        }

        public void setDataBase(int dataBase) {
            this.dataBase = dataBase;
        }

    @Override
    public void work(int dataBase) {
            System.out.println(dataBase + "start");
    }
}



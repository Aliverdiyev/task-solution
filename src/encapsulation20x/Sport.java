package encapsulation20x;

public class Sport {
        private String sportName;
        private int numPlayers;
        private String governingBody;
        private String headOfficial;
        private boolean isOlympic;

        public Sport(String sportName) {
            this(sportName, 0);
            System.out.println("sport 0");
        }

        public Sport(String sportName, int numPlayers) {
            this(sportName, numPlayers, "");
            System.out.println("sport 1");
        }

        public Sport(String sportName, int numPlayers, String governingBody) {
            this(sportName, numPlayers, governingBody, "");
            System.out.println("sport 2");
        }

        public Sport(String sportName, int numPlayers, String governingBody, String headOfficial) {
            this(sportName, numPlayers, governingBody, headOfficial, false);
            System.out.println("sport 3");
        }

        public Sport(String sportName, int numPlayers, String governingBody, String headOfficial, boolean isOlympic) {
            this.sportName = sportName;
            this.numPlayers = numPlayers;
            this.governingBody = governingBody;
            this.headOfficial = headOfficial;
            this.isOlympic = isOlympic;
            System.out.println("sport 4");
        }

        public String getSportName() {
            return sportName;
        }

        public void setSportName(String sportName) {
            this.sportName = sportName;
        }

        public int getNumPlayers() {
            return numPlayers;
        }

        public void setNumPlayers(int numPlayers) {
            this.numPlayers = numPlayers;
        }

        public String getGoverningBody() {
            return governingBody;
        }

        public void setGoverningBody(String governingBody) {
            this.governingBody = governingBody;
        }

        public String getHeadOfficial() {
            return headOfficial;
        }

        public void setHeadOfficial(String headOfficial) {
            this.headOfficial = headOfficial;
        }

        public boolean isOlympic() {
            return isOlympic;
        }

        public void setOlympic(boolean olympic) {
            isOlympic = olympic;
        }
    }
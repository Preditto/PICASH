package ButtonPush;

public class Picash {

    int toruhit(){
        if(Math.random()>0.45){
            IO.println("Toru MISSED his attack");
            return 0;
        }
        else{
            IO.println("Toru LANDED his attack");
            return 1;
        }
    }

    int toru(String name){
        int toru_hp = 90, player_hp=100;
        IO.println("I stole Bank Note from the Fatty Bald Tenny LOL");
        IO.println("You want it?");
        IO.println("Beat me first, we can keep discussions for later");
        IO.println();
        IO.println(String.format("%-25s HP: 90","Prodigy Toru"));
        IO.println(String.format("%-25s HP: 100",name));
        IO.println();
        while(toru_hp > 0 && player_hp > 0) {
            int play = Integer.parseInt(IO.readln("1. Attack\t\t\t 2. Heal  "));
            IO.println();
            if (play == 1) {
                toru_hp = toru_hp - 10;
                IO.println(String.format("%-25s HP: "+toru_hp,"Prodigy Toru"));
                IO.println(String.format("%-25s HP: "+player_hp,name));
            }
            else if (play==2) {
                player_hp = player_hp + 5;
                IO.println(String.format("%-25s HP: " + toru_hp, "Prodigy Toru"));
                IO.println(String.format("%-25s HP: " + player_hp, name));
            }
            int toruatk=toruhit();
            if (toruatk==1){
                player_hp = player_hp - 15;
            }
        }
        if(toru_hp<=0) {
            IO.println("Congratulations you have beaten PRODIGY TORU");
            IO.println("FINE, here is the BANK NOTE");
            return 1;
        }
        else if (player_hp<=0) {
            IO.println("You have lost to PRODIGY TORU");
            IO.println("GG, I hope Brother Torsu would be proud of me");
            return 0;
        }
        return 0;
    }

    int tennyhit(){
        if(Math.random()>0.5){
            IO.println("Tenny MISSED his attack");
            return 0;
        }
        else{
            IO.println("Tenny LANDED his attack");
            return 1;
        }
    }

    int tenny(String name){
        int tenny_hp = 110, player_hp=100;
        IO.println();
        IO.println("Thanks for bringing me my BANK NOTE back");
        IO.println("How about I give you something for your hardwork?");
        IO.println("You would have to beat me tho!");
        IO.println();
        IO.println(String.format("%-25s HP: 110","Bank Owner Tenny"));
        IO.println(String.format("%-25s HP: 100",name));
        IO.println();
        while(tenny_hp > 0 && player_hp > 0) {
            int play = Integer.parseInt(IO.readln("1. Attack\t\t\t 2. Heal  "));
            IO.println();
            if (play == 1) {
                tenny_hp = tenny_hp - 10;
                IO.println(String.format("%-25s HP: "+tenny_hp,"Bank Owner Tenny"));
                IO.println(String.format("%-25s HP: "+player_hp,name));
            }
            else if (play==2) {
                player_hp = player_hp + 5;
                IO.println(String.format("%-25s HP: " + tenny_hp, "Bank Owner Tenny"));
                IO.println(String.format("%-25s HP: " + player_hp, name));
            }
            int tennyatk=tennyhit();
            if (tennyatk==1){
                player_hp = player_hp - 17;
            }
        }
        if(tenny_hp<=0) {
            IO.println();
            IO.println("Congratulations you have beaten BANK OWNER TENNY");
            IO.println("Here with this you can finally battle the CHAMPION");
            IO.println("You obtained the BATTLE PASS");
            return 1;
        }
        else if (player_hp<=0) {
            IO.println("You have lost to BANK OWNER TENNY");
            IO.println("Better luck next time KID");
            return 0;
        }
        return 0;
    }

    int torsuhit(){
        if(Math.random()>=0.6){
            IO.println("Torsu MISSED his attack");
            return 0;
        }
        else{
            IO.println("Torsu LANDED his attack");
            return 1;
        }
    }

    int torsu(String name){
        int torsu_hp=120,player_hp=100;
        IO.println("A challenger? Its been a while since I have had one");
        IO.println("May the luck favour you "+name);
        IO.println("I BATTLE CHAMPION TORSU");
        IO.println("ACCEPTS YOUR CHALLENGE");
        IO.println(String.format("%-25s HP: 120","Battle Champion Torsu"));
        IO.println(String.format("%-25s HP: 100",name));
        IO.println("\n");
        while(torsu_hp > 0 && player_hp > 0) {
            int play = Integer.parseInt(IO.readln("1. Attack\t\t\t 2. Heal  "));
            if (play == 1) {
                torsu_hp = torsu_hp - 10;
                IO.println(String.format("%-25s HP: "+torsu_hp,"Battle Champion Torsu"));
                IO.println(String.format("%-25s HP: "+player_hp,name));
            }
            else if (play==2) {
                player_hp = player_hp + 5;
                IO.println(String.format("%-25s HP: " + torsu_hp, "Battle Champion Torsu"));
                IO.println(String.format("%-25s HP: " + player_hp, name));
            }
            int torsuatk=torsuhit();
            if (torsuatk==1){
                player_hp = player_hp - 20;
            }
        }
        if(torsu_hp<=0) {
            IO.println("Congratulations you have beaten BATTLE CHAMPION TORSU");
            IO.println("Well... that was CINEMA");
            return 1;
        }
        else if (player_hp<=0) {
            IO.println("You have lost to BATTLE CHAMPION TORSU");
            IO.println("Sorry, I am just too strong");
            IO.println("Come back when you are stronger "+name);
            return 0;
        }
        return 0;
    }

    void main(){
        IO.println();
        IO.println(String.format("%40s","WELCOME TO PICASH"));
        String name = IO.readln("Whats your name ");
        int age = Integer.parseInt(IO.readln("Whats your age? "));
        IO.println();
        IO.println("Hope you enjoy playing picash "+name);
        int banknote = 0, battlepass = 0, grandslam = 0;
        while(grandslam!=1) {
            IO.println();
            int n = Integer.parseInt(IO.readln("Who do you want to Battle?\n1. Prodigy Toru\n2. Bank Owner Tenny\n3. Battle Champion Torsu\n"));
            if (n == 1 || n == 2 || n == 3) {
                if (n == 3) {
                    if (battlepass == 1) {
                        grandslam = torsu(name);
                        battlepass=0;
                    }
                    else{
                        IO.println("Sorry you can only battle the CHAMPION if you have the BATTLE PASS");
                    }
                } else if (n == 2) {
                    if (banknote == 1) {
                        battlepass = tenny(name);
                        banknote=0;
                    } else {
                        IO.println("A kid stole my BANK NOTE");
                        IO.println("Help me find it would you?");
                    }

                } else if (n == 1) {
                    banknote = toru(name);
                }
            }
        }
        if (grandslam==1){
            IO.println();
            IO.println("Thanks for playing PICASH");
            IO.println();
            IO.println("Keep tuned for more updates!");
        }
    }

}

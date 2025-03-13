import java.util.scanner;
class voter{
    string name;
    int age;
    boolean hasvoted;
    public voter(string name, int age){
        this.name=name;
        this.age=age;
        this.hasvoted=false;
    }
    public boolean isEligible(){
        return age>=18;
    }
}
class candidate{
    string name`;
    int votes;
    Public candidate(string name ){
        this.name=name;
        this.vote=0;
    } 
    Public void recievevote(){
        vote++;
    }
}
Public class voting system{
    public static void main(string[] args){
        Scanner Scanner=new Scanner(system.in);
        candidate[] candidate={
            new candidate("Alice"),
            new candidate("Bob"),
            new candidate("Charlie")
        };
        system.out.println("Enter your name: ");
        string votername=Scanner.nextline;
        system.out.println("Enter your age: ");
        int age =Scanner.nextline();
        Voter voter =new voter(voter name.age);
        if(!voter.isEligible()){
            system.out.println("You are not eligible");
            Scanner.close();
            return;
        }
        system.out.println("\n Candidates: ");
        for(int i=0; i<candidate.length; i++){

            
        }
        }

    }
}
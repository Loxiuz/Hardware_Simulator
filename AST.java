public abstract class AST {}

class Identifier {

    public String identifier;

    public Identifier(String identifier){
        this.identifier = identifier;
    }
    public String eval(){return identifier;}
}
class Const{

    public Integer c;

    public Const(Integer c){
        this.c = c;
    }
    public Integer eval(){return c;}
}
/************************************************/
abstract class Command extends AST{
    abstract public boolean eval();
}



/************************************************/
abstract class Condition {
    abstract public boolean eval();
}
class And extends Condition{

    Condition c1;
    Condition c2;

    public And(Condition c1, Condition c2){
        this.c1 = c1;
        this.c2 = c2;
    }
    public boolean eval(){return c1.eval() && c2.eval();}
}
class Negation extends Condition{

    Condition c1;

    public Negation(Condition c1){
        this.c1 = c1;
    }
    public boolean eval(){return !c1.eval();}
}
/************************************************/
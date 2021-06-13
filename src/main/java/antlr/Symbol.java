package antlr;


public class Symbol {
    String  name,type;
    int scope; //attributes later on ,e.g static,public,final...
    Symbol(String n, String t,int s){
        name = n;
        type = t;
        scope =s;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getScope() {
        return scope;
    }

    public boolean equals(Symbol sym) {
        return sym.name.equals(name)&&sym.type.equals(type)&&(sym.scope==scope);
    }
    public boolean checkScope(Symbol sym){
        return sym.scope==scope;
    }
    public boolean checkType(Symbol sym){
        return sym.type.equals(type);
    }
}


package parser;

import lexer.Token;

import java.util.ArrayList;

public class treeNode {
    Token nodeToken ;
    String identifier;
    ArrayList<treeNode> rightNodes;
    public treeNode(Token t){
        nodeToken =t;
        identifier = t.getValue();
        rightNodes = new ArrayList<>();
    }
    public treeNode(String id){
        identifier =id;
        nodeToken =null;
        rightNodes = new ArrayList<>();
    }
    public void addRightNode(treeNode t){
        rightNodes.add(t);
    }
    public Token getNodeToken(){
        return nodeToken;
    }
    public void print(String ident){

        if(nodeToken!=null)
            System.out.println(ident+"=>"+nodeToken.getType().getValue()+" : "+nodeToken.getValue());
        else System.out.println(ident+identifier);

        if(!rightNodes.isEmpty()){
            ident+="\t";
            for(treeNode n : rightNodes)
                n.print(ident);
        }
    }
}

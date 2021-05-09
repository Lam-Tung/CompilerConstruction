package parser;

import lexer.Token;

import java.util.ArrayList;

public class treeNode {
    /**
     * the base token of this tree node
     */
    Token nodeToken ;
    /**
     * the identifier of this tree node in case the tree isn't based on a token
     */
    String identifier;
    /**
     * the right nodes or children nodes of this tree node
     */
    ArrayList<treeNode> rightNodes;

    /**
     * @brief constructor that creates a tree node based on an existing token
     * @param t the token to use as the base of this tree node
     */
    public treeNode(Token t){
        nodeToken =t;
        identifier = t.getValue();
        rightNodes = new ArrayList<>();
    }

    /**
     * @brief constructor for nodes with no tokens like root, package declaring , function declaring ...
     * @param id is an id to identify this tree node with ,e.g package_dec , func_dec ...
     */
    public treeNode(String id){
        identifier =id;
        nodeToken =null;
        rightNodes = new ArrayList<>();
    }

    /**
     * @brief addes a right tree node to the current tree node
     * @param t the right node to be added
     */
    public void addRightNode(treeNode t){
        rightNodes.add(t);
    }
    public Token getNodeToken(){
        return nodeToken;
    }

    /**
     * @brief prints the AST in a recursive form to print all tree nodes
     * @param ident an ident is added at each tree node to identify children nodes from parent nodes
     */
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

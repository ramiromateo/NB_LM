/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalcompi1;

import Analizadores.parserCli;
import Analizadores.scannerCli;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author José
 */
public class FinalCompi1 {

    /**
     * @param args the command line arguments
     */
    public static Arbol arbol=new Arbol("name","linea","col","value");
    
    public static void Agregarhijo(){
      
    }
    public static void main(String[] args) {
        //System.out.println(arbol.toString());
        /*Duck duck = new ModelDuck();
	duck.display();
        duck.performanceFly();
	duck.performanceQuack();
	duck.setFlyBehavior( new FlyLikeRocket() );
	duck.performanceFly();*/
        FinalCompi1 ca=new FinalCompi1();
        
        System.out.println(12.5%5.3);
        System.out.println(ca.toString()+15);
        
    }
    public static void dibujar(String cadena){
       String toPrint="digraph g {\nnode [fontcolor=\"black\", height=0.5, color=\"black\"] [shape=oval, style=filled, color=lightblue]	edge  [color=\"black\", dir=fordware] ";
        
	toPrint+=cadena+" }";
	FileWriter f;
        try {
            f = new FileWriter( "arbolbin.dot");
            f.write(toPrint);

            f.close();

        } catch (IOException ex) {
            
        }
        try{
            Runtime rt=Runtime.getRuntime();
            rt.exec("dot -Tpng arbolbin.dot -o arbolbin.png");
            File path=new File("arbolbin.png");
            Desktop.getDesktop().open(path);
            
        }catch(Exception e){}
    }
  

    
}
class comida{
    public final void come(){
        System.out.println("hola es un dia de comid");
    }
}

class pan extends comida {
   
}
class panito extends pan{
    public int p9=0;
    
}










interface FlyBehavior
{
    public void fly();
}

class FlyWithWings implements FlyBehavior
{
    @Override
    public void fly(){ System.out.println( "Estoy volando!! !!" ); }
}

class FlyNoWay implements FlyBehavior
{
    public void fly(){ System.out.println( "No puedo volar :(" ); }
}

class FlyLikeRocket implements FlyBehavior
{
    public void fly(){ System.out.println( "Volando al infinito y mas alla..." ); }
}

interface QuackBehavior
{
    public void quack();
}

class Quack implements QuackBehavior
{
    public void quack(){ System.out.println( "Hago Quack!" ); }
}

class Squeak implements QuackBehavior
{
    public void quack(){ System.out.println( "Squeak!!" ); }
}

class MuteQuack implements QuackBehavior
{
    public void quack(){ System.out.println( "<< Silencio >>" ); }
}

abstract class Duck
{
    protected FlyBehavior flyBehavior; 
    protected QuackBehavior quackBehavior;
    
    public void performanceFly(){ flyBehavior.fly(); }
    public void performanceQuack(){ quackBehavior.quack(); }
    
    public void swim(){ System.out.println( "Estoy nadando" ); }
    
    public abstract void display();
    
    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
    
    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}

class MallardDuck extends Duck
{
    public MallardDuck()
    {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    
    public void display()
    {
        System.out.println( "Hola, soy un pato silvestre" );
    }
}

class RedHeadDuck extends Duck{
    public RedHeadDuck()
    {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    
    public void display()
    {
        System.out.println( "Hola, soy un pato cabeza roja" );
    }
}

class RubberDuck extends Duck
{
    public RubberDuck()
    {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    
    public void display()
    {
        System.out.println( "Hola, soy un pato de goma, lindo, lindo" );
    }
}

class DecoyDuck extends Duck
{
    public DecoyDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
    
    public void display(){
        System.out.println("Hola, soy un pato señuelo º.º");
    }
}

class ModelDuck extends Duck{
	public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
    
    public void display(){
        System.out.println("Hola, soy un pato modelo");
    }
}
import javax.swing.*;
import java.awt.event.*;
import java.awt.print.PrinterException;

class note extends JFrame implements ActionListener{

    // frame declaration
    JFrame f;

    JTextArea t; // textarea declaration


    // constructor
    note(){
        // initializing the frame
        f = new JFrame("notepad");

        // initializing the textarea
        t = new JTextArea();

        // create a menubar
        JMenuBar menuBar = new JMenuBar();

        // creating the file menu
        JMenu file = new JMenu("File");
        // creating the option for files
        JMenuItem f1 = new JMenuItem("New");
        JMenuItem f2 = new JMenuItem("Save");
        JMenuItem f3 = new JMenuItem("Open");
        JMenuItem f4 = new JMenuItem("Print");

        // adding the actionlistener to files;
        f1.addActionListener(this);
        f2.addActionListener(this);
        f3.addActionListener(this);
        f4.addActionListener(this);

        // adding the options to the file menu
        file.add(f1);
        file.add(f2);
        file.add(f3);
        file.add(f4);

        // creating the edit menu
        JMenu edit = new JMenu("Edit");
        // creating the option for files
        JMenuItem e1 = new JMenuItem("Cut");
        JMenuItem e2 = new JMenuItem("Copy");
        JMenuItem e3 = new JMenuItem("Paste");

        // adding the actionlistener to files;
        e1.addActionListener(this);
        e2.addActionListener(this);
        e3.addActionListener(this);

        // adding the options to the file menu
        edit.add(e1);
        edit.add(e2);
        edit.add(e3);

        // creating the close button
        JMenuItem close = new JMenuItem("Close");
        close.addActionListener(this);

        // adding menus to the menubar
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(close);

        f.setJMenuBar(menuBar);
        f.add(t);
        f.setSize(1280, 720);
        f.setVisible(true);




    }



    // to add the functionlities;
    public void actionPerformed(ActionEvent e){

        // extracting the command into a string
        String s = e.getActionCommand();

        switch (s){
            case "New":
                t.setText("");
                break;
            case "Save":

                break;
            case "Open":
                break;
            case "Print":
                try {
                    t.print();
                } catch (PrinterException ex) {
                    throw new RuntimeException(ex);
                }
                break;
            case "Cut":
                t.cut();
                break;
            case "Copy":
                t.copy();
                break;
            case "Paste":
                t.paste();
                break;
            case "Close":
                t.setVisible(false);
                break;


        }

    }

    public static void main(String args[]){
        note n = new note();
    }
}

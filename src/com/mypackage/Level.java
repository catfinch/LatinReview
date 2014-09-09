package com.mypackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Level extends JPanel
                     implements ActionListener{
    protected JButton declen, lat2, w2, back1, first, second, third, fourth, fifth, done;
    protected JLabel l1;

    protected JTextField ar1c1, ar1c2, ar2c1, ar2c2, ar3c1,ar3c2,ar4c1,ar4c2,ar5c1,ar5c2, score;
    protected JLabel r1, r2, r3, r4, r5;
    protected JSeparator row12, row23, row34, row45;

    public static String nom1 = "", nom2= "", gen1= "",gen2= "", dat1= "",dat2= "",acc1= "",acc2= "",abl1= "",abl2= "", Results;
    public static boolean ShowWeek = false, Results_Shown = false;
    public static String Declension = "";
    public static int Right = 0;
    public Level(){
        // = new JButton("");
        //.setActionCommand("");
        //.setVisible();
        //.addActionListener(this);
        //add();

        //com.mypackage.Level 1 of buttons
        declen = new JButton("Noun Declensions");
        declen.setActionCommand("Declensions");
        declen.setVisible(true);

        lat2 = new JButton("Latin 2*");
        lat2.setVerticalTextPosition(AbstractButton.CENTER);
        lat2.setHorizontalTextPosition(AbstractButton.LEADING);
        lat2.setActionCommand("expandTest");
        lat2.setHorizontalAlignment(SwingConstants.CENTER);
        lat2.setVerticalAlignment(SwingConstants.CENTER);
        lat2.setVisible(true);

        declen.addActionListener(this);
        lat2.addActionListener(this);

        declen.setToolTipText("fill out the declension chart");

        add(declen);
        add(lat2);
        //label for level one
        l1 = new JLabel("Test");
        l1.setText("Pick your class");
        l1.setVisible(true);


        add(l1);

        w2 = new JButton("Week 1");
        w2.setVisible(false);
        w2.setActionCommand("hi");
        w2.setVerticalAlignment(SwingConstants.CENTER);

        back1 = new JButton("Back");
        back1.setVisible(false);
        back1.setActionCommand("back");

        w2.addActionListener(this);
        back1.addActionListener(this);

        add(w2);
        add(back1);

        first= new JButton("1st");
        second = new JButton("2nd");
        third = new JButton("3rd");
        fourth = new JButton("3rd -i stem");
        fifth = new JButton("4th");

        first .setActionCommand("First");
        second.setActionCommand("Second");
        third .setActionCommand("Third");
        fourth.setActionCommand("Third -i stem");
        fifth .setActionCommand("Fourth");

        first.setVisible(false);
        second.setVisible(false);
        third.setVisible(false);
        fourth.setVisible(false);
        fifth.setVisible(false);

        first.addActionListener(this);
        second.addActionListener(this);
        third.addActionListener(this);
        fourth.addActionListener(this);
        fifth.addActionListener(this);

        add(first);
        add(second);
        add(third);
        add(fourth);
        add(fifth);

        done = new JButton("Done");

        done.setVisible(false);

        done.setActionCommand("done");

        done.addActionListener(this);





        ar1c1 = new JTextField();
        ar1c2 = new JTextField();
        ar2c1= new JTextField();
        ar2c2= new JTextField();
        ar3c1= new JTextField();
        ar3c2= new JTextField();
        ar4c1= new JTextField();
        ar4c2= new JTextField();
        ar5c1= new JTextField();
        ar5c2= new JTextField();

        r1 = new JLabel("Nom.");
        r2 = new JLabel("Gen.");
        r3 = new JLabel("Dat.");
        r4 = new JLabel("Acc.");
        r5 = new JLabel("Abl.");
        r1.setVisible(false);
        r2.setVisible(false);
        r3.setVisible(false);
        r4.setVisible(false);
        r5.setVisible(false);

        ar1c1.setVisible(false);
        ar1c2.setVisible(false);
        ar2c1.setVisible(false);
        ar2c2.setVisible(false);
        ar3c1.setVisible(false);
        ar3c2.setVisible(false);
        ar4c1.setVisible(false);
        ar4c2.setVisible(false);
        ar5c1.setVisible(false);
        ar5c2.setVisible(false);

        ar1c1.setEditable(true);
        ar1c2.setEditable(true);
        ar2c1.setEditable(true);
        ar2c2.setEditable(true);
        ar3c1.setEditable(true);
        ar3c2.setEditable(true);
        ar4c1.setEditable(true);
        ar4c2.setEditable(true);
        ar5c1.setEditable(true);
        ar5c2.setEditable(true);

        ar1c1.setColumns(8);
        ar1c2.setColumns(8);
        ar2c1.setColumns(8);
        ar2c2.setColumns(8);
        ar3c1.setColumns(8);
        ar3c2.setColumns(8);
        ar4c1.setColumns(8);
        ar4c2.setColumns(8);
        ar5c1.setColumns(8);
        ar5c2.setColumns(8);

        ar1c1.setToolTipText("Nom Sing");
        ar1c2.setToolTipText("Nom Plur");
        ar2c1.setToolTipText("Gen Sing");
        ar2c2.setToolTipText("Gen Plur");
        ar3c1.setToolTipText("Dat Sing");
        ar3c2.setToolTipText("Dat Plur");
        ar4c1.setToolTipText("Acc Sing");
        ar4c2.setToolTipText("Acc Plur");
        ar5c1.setToolTipText("Abl Sing");
        ar5c2.setToolTipText("Abl Plur");

        add(r1);
        add(ar1c1);
        add(ar1c2);
        add(r2);
        add(ar2c1);
        add(ar2c2);
        add(r3);
        add(ar3c1);
        add(ar3c2);
        add(r4);
        add(ar4c1);
        add(ar4c2);
        add(r5);
        add(ar5c1);
        add(ar5c2);
        add(done);

        score = new JTextField();
        score.setEditable(false);

        add(score);
    }


    public void actionPerformed(ActionEvent e){
        Object src = e.getActionCommand();
        if(src == "expandTest") {
            System.out.println(src);
            w2.setVisible(true);
            back1.setVisible(true);

            declen.setVisible(false);
            l1.setVisible(false);
            System.out.println("com.mypackage.Level to Weeks");
            src = e.getActionCommand();
        }
        if(src == "back"){
            System.out.println(src);
            w2.setVisible(false);
            back1.setVisible(false);

            declen.setVisible(true);
            l1.setVisible(true);
            System.out.println("Back to com.mypackage.Level");
            src = e.getActionCommand();
        }
        if(src == "Declensions"){
            System.out.println(src);
            declen.setVisible(false);
            lat2.setVisible(false);
            l1.setVisible(false);

            first.setVisible(true);
            second.setVisible(true);
            third.setVisible(true);
            fourth.setVisible(true);
            fifth.setVisible(true);
            src = e.getActionCommand();
        }
        if(src == "First"){
            System.out.println(src);



            first.setVisible(false);
            second.setVisible(false);
            third.setVisible(false);
            fourth.setVisible(false);
            fifth.setVisible(false);


            ar1c1.setVisible(true);
            ar1c2.setVisible(true);
            ar2c1.setVisible(true);
            ar2c2.setVisible(true);
            ar3c1.setVisible(true);
            ar3c2.setVisible(true);
            ar4c1.setVisible(true);
            ar4c2.setVisible(true);
            ar5c1.setVisible(true);
            ar5c2.setVisible(true);
            r1.setVisible(true);
            r2.setVisible(true);
            r3.setVisible(true);
            r4.setVisible(true);
            r5.setVisible(true);

            done.setVisible(true);
            Declension = "FirstDec";
            src = e.getActionCommand();

        }
        if(src == "Second"){
            System.out.println(src);
            first.setVisible(false);
            second.setVisible(false);
            third.setVisible(false);
            fourth.setVisible(false);
            fifth.setVisible(false);

            ar1c1.setVisible(true);
            ar1c2.setVisible(true);
            ar2c1.setVisible(true);
            ar2c2.setVisible(true);
            ar3c1.setVisible(true);
            ar3c2.setVisible(true);
            ar4c1.setVisible(true);
            ar4c2.setVisible(true);
            ar5c1.setVisible(true);
            ar5c2.setVisible(true);
            r1.setVisible(true);
            r2.setVisible(true);
            r3.setVisible(true);
            r4.setVisible(true);
            r5.setVisible(true);

            done.setVisible(true);
            Declension = "SecondDec";
            src = e.getActionCommand();
        }
        if(src == "Third"){
            System.out.println(src);
            first.setVisible(false);
            second.setVisible(false);
            third.setVisible(false);
            fourth.setVisible(false);
            fifth.setVisible(false);

            ar1c1.setVisible(true);
            ar1c2.setVisible(true);
            ar2c1.setVisible(true);
            ar2c2.setVisible(true);
            ar3c1.setVisible(true);
            ar3c2.setVisible(true);
            ar4c1.setVisible(true);
            ar4c2.setVisible(true);
            ar5c1.setVisible(true);
            ar5c2.setVisible(true);
            r1.setVisible(true);
            r2.setVisible(true);
            r3.setVisible(true);
            r4.setVisible(true);
            r5.setVisible(true);

            done.setVisible(true);
            Declension = "ThirdDec";
            src = e.getActionCommand();
        }
        if(src == "Fourth"){
            System.out.println(src);
            first.setVisible(false);
            second.setVisible(false);
            third.setVisible(false);
            fourth.setVisible(false);
            fifth.setVisible(false);

            ar1c1.setVisible(true);
            ar1c2.setVisible(true);
            ar2c1.setVisible(true);
            ar2c2.setVisible(true);
            ar3c1.setVisible(true);
            ar3c2.setVisible(true);
            ar4c1.setVisible(true);
            ar4c2.setVisible(true);
            ar5c1.setVisible(true);
            ar5c2.setVisible(true);
            r1.setVisible(true);
            r2.setVisible(true);
            r3.setVisible(true);
            r4.setVisible(true);
            r5.setVisible(true);

            done.setVisible(true);
            Declension = "FourthDec";
            src = e.getActionCommand();
        }
        if(src == "Fifth"){
            System.out.println(src);
            first.setVisible(false);
            second.setVisible(false);
            third.setVisible(false);
            fourth.setVisible(false);
            fifth.setVisible(false);

            ar1c1.setVisible(true);
            ar1c2.setVisible(true);
            ar2c1.setVisible(true);
            ar2c2.setVisible(true);
            ar3c1.setVisible(true);
            ar3c2.setVisible(true);
            ar4c1.setVisible(true);
            ar4c2.setVisible(true);
            ar5c1.setVisible(true);
            ar5c2.setVisible(true);
            r1.setVisible(true);
            r2.setVisible(true);
            r3.setVisible(true);
            r4.setVisible(true);
            r5.setVisible(true);

            done.setVisible(true);
            Declension = "FifthDec";
            src = e.getActionCommand();
        }
        if(src == "done"){
            System.out.println(src + " "+Declension);

            if (Declension.equals("FirstDec")){
                nom1 = ar1c1.getText();
                nom2 = ar1c2.getText();
                gen1 = ar2c1.getText();
                gen2 = ar2c2.getText();
                dat1 = ar3c1.getText();
                dat2 = ar3c2.getText();
                acc1 = ar4c1.getText();
                acc2 = ar4c2.getText();
                abl1 = ar5c1.getText();
                abl2 = ar5c2.getText();

                if(nom1.equals("a")){
                    Right++;
                    System.out.println("nom1 = true");
                    System.out.println(ar1c1.getText());
                }
                if(nom1.equals("-a")){
                  Right++;
                }
                if(nom2.equals("ae") ){
                    Right++;
                }
                if (nom2.equals("-ae")){
                    Right++;
                }
                if (gen1.equals("ae")){
                    Right++;
                }
                if(gen1.equals("-ae")){
                    Right++;
                }
                if(gen2.equals("arum")){
                    Right++;
                }
                if (gen2.equals("-arum")){
                    Right++;
                }
                if (dat1.equals("ae")){
                    Right++;
                }
                if (dat1.equals("-ae")){
                    Right++;
                }
                if (dat2.equals("is")){
                    Right++;
                }
                if (dat2.equals("-is")){
                    Right++;
                }
                if (acc1.equals("am")){
                    Right++;
                }
                if (acc1.equals("-am")){
                    Right++;
                }
                if (acc2.equals("as")){
                    Right++;
                }
                if (acc2.equals("-as")){
                    Right++;
                }
                if (abl1.equals("a")){
                    Right++;
                }
                if (abl1.equals("-a")){
                    Right++;
                }
                if(abl2.equals("ae")){
                    Right++;
                }
                if (abl2.equals("-ae")){
                    Right++;
                }
                ar1c1.setVisible(false);
                ar1c2.setVisible(false);
                ar2c1.setVisible(false);
                ar2c2.setVisible(false);
                ar3c1.setVisible(false);
                ar3c2.setVisible(false);
                ar4c1.setVisible(false);
                ar4c2.setVisible(false);
                ar5c1.setVisible(false);
                ar5c2.setVisible(false);
                r1.setVisible(false);
                r2.setVisible(false);
                r3.setVisible(false);
                r4.setVisible(false);
                r5.setVisible(false);
                done.setVisible(false);

                System.out.println(Right);
                Results = Integer.toString(Right) + " of 10";
                score.setText(Results);
                score.setVisible(true);

            }
            if (Declension.equals("SecondDec")){
                nom1 = ar1c1.getText();
                nom2 = ar1c2.getText();
                gen1 = ar2c1.getText();
                gen2 = ar2c2.getText();
                dat1 = ar3c1.getText();
                dat2 = ar3c2.getText();
                acc1 = ar4c1.getText();
                acc2 = ar4c2.getText();
                abl1 = ar5c1.getText();
                abl2 = ar5c2.getText();

                if(nom1.equals("us/um")){
                    Right++;
                    System.out.println("nom1 = true");
                    System.out.println(ar1c1.getText());
                }
                if(nom1.equals("-us/-um")){
                    Right++;
                }
                if(nom1.equals("us/-um")){
                    Right++;
                }if(nom1.equals("-us/um")){
                    Right++;
                }
                if(nom2.equals("i/a") ){
                    Right++;
                }
                if (nom2.equals("-i/-a")){
                    Right++;
                }
                if (nom2.equals("i/-a")){
                    Right++;
                }
                if (nom2.equals("-i/a")){
                    Right++;
                }
                if (gen1.equals("i")){
                    Right++;
                }
                if(gen1.equals("-i")){
                    Right++;
                }
                if(gen2.equals("orum")){
                    Right++;
                }
                if (gen2.equals("-orum")){
                    Right++;
                }
                if (dat1.equals("o")){
                    Right++;
                }
                if (dat1.equals("-o")){
                    Right++;
                }
                if (dat2.equals("is")){
                    Right++;
                }
                if (dat2.equals("-is")){
                    Right++;
                }
                if (acc1.equals("um")){
                    Right++;
                }
                if (acc1.equals("-um")){
                    Right++;
                }
                if (acc2.equals("os/a")){
                    Right++;
                }
                if (acc2.equals("-os/-a")){
                    Right++;
                }
                if (acc2.equals("os/-a")){
                    Right++;
                }
                if (acc2.equals("-os/a")){
                    Right++;
                }
                if (abl1.equals("o")){
                    Right++;
                }
                if (abl1.equals("-o")){
                    Right++;
                }
                if(abl2.equals("is")){
                    Right++;
                }
                if (abl2.equals("-is")){
                    Right++;
                }
                ar1c1.setVisible(false);
                ar1c2.setVisible(false);
                ar2c1.setVisible(false);
                ar2c2.setVisible(false);
                ar3c1.setVisible(false);
                ar3c2.setVisible(false);
                ar4c1.setVisible(false);
                ar4c2.setVisible(false);
                ar5c1.setVisible(false);
                ar5c2.setVisible(false);
                r1.setVisible(false);
                r2.setVisible(false);
                r3.setVisible(false);
                r4.setVisible(false);
                r5.setVisible(false);
                done.setVisible(false);

                System.out.println(Right);
                Results = Integer.toString(Right) + " of 10";
                score.setText(Results);
                score.setVisible(true);

            }
            if (Declension.equals("ThirdDec")){
                nom1 = ar1c1.getText();
                nom2 = ar1c2.getText();
                gen1 = ar2c1.getText();
                gen2 = ar2c2.getText();
                dat1 = ar3c1.getText();
                dat2 = ar3c2.getText();
                acc1 = ar4c1.getText();
                acc2 = ar4c2.getText();
                abl1 = ar5c1.getText();
                abl2 = ar5c2.getText();

                if(nom1.equals("")){
                    Right++;
                    System.out.println("nom1 = true");
                    System.out.println(ar1c1.getText());
                }
                if(nom1.equals("-")){
                    Right++;
                }
                if(nom1.equals("-/-")){
                    Right++;
                }
                if(nom1.equals("/")){
                    Right++;
                }
                if(nom1.equals(" / ")){
                    Right++;
                }
                if(nom2.equals("es/a") ){
                    Right++;
                }
                if (nom2.equals("-es/-a")){
                    Right++;
                }
                if (nom2.equals("es/-a")){
                    Right++;
                }
                if (nom2.equals("-es/a")){
                    Right++;
                }
                if (gen1.equals("is")){
                    Right++;
                }
                if(gen1.equals("-is")){
                    Right++;
                }
                if(gen2.equals("um")){
                    Right++;
                }
                if (gen2.equals("-um")){
                    Right++;
                }
                if (dat1.equals("i")){
                    Right++;
                }
                if (dat1.equals("-i")){
                    Right++;
                }
                if (dat2.equals("ibus")){
                    Right++;
                }
                if (dat2.equals("-ibus")){
                    Right++;
                }
                if (acc1.equals("em/-")){
                    Right++;
                }
                if (acc1.equals("-em/-")){
                    Right++;
                }
                if (acc1.equals("-em/ ")){
                    Right++;
                }
                if (acc1.equals("em/ ")){
                    Right++;
                }
                if (acc2.equals("es/a")){
                    Right++;
                }
                if (acc2.equals("-es/-a")){
                    Right++;
                }
                if (acc2.equals("es/-a")){
                    Right++;
                }
                if (acc2.equals("-es/a")){
                    Right++;
                }
                if (abl1.equals("e")){
                    Right++;
                }
                if (abl1.equals("-e")){
                    Right++;
                }
                if(abl2.equals("ibus")){
                    Right++;
                }
                if (abl2.equals("-ibus")){
                    Right++;
                }
                ar1c1.setVisible(false);
                ar1c2.setVisible(false);
                ar2c1.setVisible(false);
                ar2c2.setVisible(false);
                ar3c1.setVisible(false);
                ar3c2.setVisible(false);
                ar4c1.setVisible(false);
                ar4c2.setVisible(false);
                ar5c1.setVisible(false);
                ar5c2.setVisible(false);
                r1.setVisible(false);
                r2.setVisible(false);
                r3.setVisible(false);
                r4.setVisible(false);
                r5.setVisible(false);
                done.setVisible(false);

                System.out.println(Right);
                Results = Integer.toString(Right) + " of 10";
                score.setText(Results);
                score.setVisible(true);


            }
            if (Declension.equals("FourthDec")){
                nom1 = ar1c1.getText();
                nom2 = ar1c2.getText();
                gen1 = ar2c1.getText();
                gen2 = ar2c2.getText();
                dat1 = ar3c1.getText();
                dat2 = ar3c2.getText();
                acc1 = ar4c1.getText();
                acc2 = ar4c2.getText();
                abl1 = ar5c1.getText();
                abl2 = ar5c2.getText();

                if(nom1.equals("is/e")){
                    Right++;
                    System.out.println("nom1 = true");
                    System.out.println(ar1c1.getText());
                }
                if(nom1.equals("-is/-e")){
                    Right++;
                }
                if(nom1.equals("is/-e")){
                    Right++;
                }
                if(nom1.equals("-is/e")){
                    Right++;
                }
                if(nom2.equals("es/ia") ){
                    Right++;
                }
                if (nom2.equals("-es/-ia")){
                    Right++;
                }
                if (nom2.equals("-es/ia")){
                    Right++;
                }
                if (nom2.equals("es/-ia")){
                    Right++;
                }
                if (gen1.equals("is")){
                    Right++;
                }
                if(gen1.equals("-is")){
                    Right++;
                }
                if(gen2.equals("ium")){
                    Right++;
                }
                if (gen2.equals("-ium")){
                    Right++;
                }
                if (dat1.equals("i")){
                    Right++;
                }
                if (dat1.equals("-i")){
                    Right++;
                }
                if (dat2.equals("ibus")){
                    Right++;
                }
                if (dat2.equals("-ibus")){
                    Right++;
                }
                if (acc1.equals("em/e")){
                    Right++;
                }
                if (acc1.equals("-em/-e")){
                    Right++;
                }
                if (acc1.equals("em/-e")){
                    Right++;
                }
                if (acc1.equals("-em/e")){
                    Right++;
                }
                if (acc2.equals("es/ia")){
                    Right++;
                }
                if (acc2.equals("-es/-ia")){
                    Right++;
                }
                if (acc2.equals("es/-ia")){
                    Right++;
                }
                if (acc2.equals("-es/ia")){
                    Right++;
                }
                if (abl1.equals("e")){
                    Right++;
                }
                if (abl1.equals("-e")){
                    Right++;
                }
                if(abl2.equals("ibus")){
                    Right++;
                }
                if (abl2.equals("-ibus")){
                    Right++;
                }
                ar1c1.setVisible(false);
                ar1c2.setVisible(false);
                ar2c1.setVisible(false);
                ar2c2.setVisible(false);
                ar3c1.setVisible(false);
                ar3c2.setVisible(false);
                ar4c1.setVisible(false);
                ar4c2.setVisible(false);
                ar5c1.setVisible(false);
                ar5c2.setVisible(false);
                r1.setVisible(false);
                r2.setVisible(false);
                r3.setVisible(false);
                r4.setVisible(false);
                r5.setVisible(false);
                done.setVisible(false);

                System.out.println(Right);
                Results = Integer.toString(Right) + " of 10";
                score.setText(Results);
                score.setVisible(true);

            }
            if (Declension.equals("FifthDec")){
                nom1 = ar1c1.getText();
                nom2 = ar1c2.getText();
                gen1 = ar2c1.getText();
                gen2 = ar2c2.getText();
                dat1 = ar3c1.getText();
                dat2 = ar3c2.getText();
                acc1 = ar4c1.getText();
                acc2 = ar4c2.getText();
                abl1 = ar5c1.getText();
                abl2 = ar5c2.getText();

                if(nom1.equals("us/u")){
                    Right++;
                    System.out.println("nom1 = true");
                    System.out.println(ar1c1.getText());
                }
                if(nom1.equals("-us/-u")){
                    Right++;
                }
                if(nom1.equals("-us/u")){
                    Right++;
                }
                if(nom1.equals("us/-u")){
                    Right++;
                }
                if(nom2.equals("us/ua") ){
                    Right++;
                }
                if (nom2.equals("-us/-ua")){
                    Right++;
                }
                if (nom2.equals("-us/ua")){
                    Right++;
                }
                if (nom2.equals("us/-ua")){
                    Right++;
                }
                if (gen1.equals("us")){
                    Right++;
                }
                if(gen1.equals("-us")){
                    Right++;
                }
                if(gen2.equals("uum")){
                    Right++;
                }
                if (gen2.equals("-uum")){
                    Right++;
                }
                if (dat1.equals("ui/u")){
                    Right++;
                }
                if (dat1.equals("-ui/-u")){
                    Right++;
                }
                if (dat1.equals("ui/-u")){
                    Right++;
                }
                if (dat1.equals("-ui/u")){
                    Right++;
                }
                if (dat2.equals("ibus/ua")){
                    Right++;
                }
                if (dat2.equals("-ibus/-ua")){
                    Right++;
                }
                if (dat2.equals("-ibus/ua")){
                    Right++;
                }
                if (dat2.equals("ibus/-ua")){
                    Right++;
                }
                if (acc1.equals("um/u")){
                    Right++;
                }
                if (acc1.equals("-um/-u")){
                    Right++;
                }
                if (acc1.equals("um/-u")){
                    Right++;
                }
                if (acc1.equals("-um/u")){
                    Right++;
                }
                if (acc2.equals("us/ua")){
                    Right++;
                }
                if (acc2.equals("-us/-ua")){
                    Right++;
                }
                if (acc2.equals("us/-ua")){
                    Right++;
                }
                if (acc2.equals("-us/ua")){
                    Right++;
                }
                if (abl1.equals("u")){
                    Right++;
                }
                if (abl1.equals("u/u")){
                    Right++;
                }
                if (abl1.equals("-u")){
                    Right++;
                }
                if (abl1.equals("-u/-u")){
                    Right++;
                }
                if (abl1.equals("u/-u")){
                    Right++;
                }
                if (abl1.equals("-u/u")){
                    Right++;
                }
                if(abl2.equals("ibus/ua")){
                    Right++;
                }
                if (abl2.equals("-ibus/-ua")){
                    Right++;
                }
                if (abl2.equals("ibus/-ua")){
                    Right++;
                }
                if (abl2.equals("-ibus/ua")){
                    Right++;
                }
                ar1c1.setVisible(false);
                ar1c2.setVisible(false);
                ar2c1.setVisible(false);
                ar2c2.setVisible(false);
                ar3c1.setVisible(false);
                ar3c2.setVisible(false);
                ar4c1.setVisible(false);
                ar4c2.setVisible(false);
                ar5c1.setVisible(false);
                ar5c2.setVisible(false);
                r1.setVisible(false);
                r2.setVisible(false);
                r3.setVisible(false);
                r4.setVisible(false);
                r5.setVisible(false);
                done.setVisible(false);

                System.out.println(Right);
                Results = Integer.toString(Right) + " of 10";
                score.setText(Results);
                score.setVisible(true);
            }

        }
    }

}

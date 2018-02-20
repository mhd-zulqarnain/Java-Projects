package AddressBook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class diaryGU {

	/**
	 * @param args
	 */
	JFrame fr;
	JButton bAdd, bUpd, bDel, bSr;
	JLabel lNm, lAd, lPh;
	JTextField tNm, tAd, tPh,tShw;
	JPanel pBtn, pCtx;
	ArrayList person;

	public diaryGU() {
		init();
		person = new ArrayList();
		load();
	}

	public void init() {
		fr = new JFrame();
		Container c = fr.getContentPane();

		bAdd = new JButton("Add");
		bUpd = new JButton("Update");
		bDel = new JButton("Delete");
		bSr = new JButton("Search");

		bAdd.setPreferredSize(new Dimension(70, 25));
		bUpd.setPreferredSize(new Dimension(70, 25));
		bDel.setPreferredSize(new Dimension(70, 25));
		bSr.setPreferredSize(new Dimension(70, 25));
		pBtn = new JPanel(new GridLayout());
		pBtn.add(bAdd);
		pBtn.add(bUpd);
		pBtn.add(bDel);
		pBtn.add(bSr);
		pBtn.setPreferredSize(new Dimension(70, 25));
		aLis a1 = new aLis();
		bAdd.addActionListener(a1);
		bUpd.addActionListener(a1);
		bDel.addActionListener(a1);
		bSr.addActionListener(a1);

		tNm = new JTextField(26);
		tAd = new JTextField(25);
		tPh = new JTextField(26);
		tShw= new JTextField(28);

		lNm = new JLabel("Name: ");
		lAd = new JLabel("Address: ");
		lPh = new JLabel("Phone: ");

		pCtx = new JPanel(new FlowLayout());
		pCtx.add(lNm);
		pCtx.add(tNm);
		pCtx.add(lAd);
		pCtx.add(tAd);
		pCtx.add(lPh);
		pCtx.add(tPh);

		pCtx.setPreferredSize(new Dimension(70, 25));
		c.setLayout(new BorderLayout());
		fr.add(pBtn, BorderLayout.NORTH);
		fr.add(pCtx, BorderLayout.CENTER);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setSize(400, 220);
	}

	private class aLis implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		
			
			if (e.getSource() == bSr) {
				String key=tNm.getText();
				
				for (int i = 0; i < person.size(); i++) {
					PersonInfo p1 = (PersonInfo) person.get(i);
					String name=p1.nm;
					if (name.equals(key)) {	
						p1.showInfo(tNm.getText());
						break;
					}
				}
			}
			
			if(e.getSource()==bAdd){
				
				String nm,ad,ph;
				nm=tNm.getText();
				ph=tPh.getText();
				ad=tAd.getText();
				PersonInfo p1=new PersonInfo(nm,ph,ad);
				person.add(p1);
				
				save();
			}
			
			if (e.getSource() == bDel) {
				String key=tNm.getText();
				
				for (int i = 0; i < person.size(); i++) {
					PersonInfo p1 = (PersonInfo) person.get(i);
					String name=p1.nm;
					if (name.equals(key)) {	

					JOptionPane.showMessageDialog(null,name+" has been deleted");
						person.remove(i);
					}
				}
				save();
			}
			
			
			tNm.setText("");
			tPh.setText("");
			tAd.setText("");
		}
		
	}

	public void save(){
		
		String name,phn,add;
		try{
			FileWriter fw=new FileWriter("Test1.txt");
			PrintWriter pr=new PrintWriter(fw);
			String s="";
			
			for(int i=0;i<person.size();i++){
				
				PersonInfo p= (PersonInfo)person.get(i);
				name=p.nm;
				phn=p.ad;
				add=p.ph;
				s=name+","+phn+","+add;
				pr.println(s);
					
			}
			fw.close();
			pr.close();
			
			
			
		}catch(IOException ex){
			System.out.println("File not found "+ex);
		}
	}
	
	void load() {
		try {
			FileReader fr = new FileReader("test1.txt");
			BufferedReader br = new BufferedReader(fr);

			String[] token = null;
			String ph, nm, ad;
			String line = br.readLine();
			while (line != null) {
				token = line.split(",");
				nm = token[0];
				ph = token[1];
				ad = token[2];

				PersonInfo p1 = new PersonInfo(nm, ph, ad);
				person.add(p1);

				line = br.readLine();

			}

		} catch (IOException e) {
			System.out.println("File not exisit " + e);
		}

	}

	public static void main(String[] args) {
		diaryGU fr = new diaryGU();

	}

}

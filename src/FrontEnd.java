	import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
//import java.awt.Dimension;
	import java.awt.event.*;
	
	import javax.swing.*;
	
	
public class FrontEnd extends JApplet implements ActionListener {

	private JTextField Name = new JTextField("Name");
	private JTextArea Msg = new JTextArea();
	public JButton S=new JButton("Send");
	public JButton G=new JButton("Get Messages");
	public JButton PICK=new JButton("OFF");
	public JPanel p = new JPanel();
	public String A[] = new String[10];
	public JComboBox List = new JComboBox(A);
	public static final Font font = new Font("Castellan", Font.BOLD, 25);
	public static final Font font1 = new Font("Calibri", Font.CENTER_BASELINE,
			20);

	// private JFrame myFrame=new JFrame();

	public void init() {
		
		
		JTextField[] g = { Name };
		JTextArea[] g1 = { Msg };
		this.setPreferredSize(new Dimension(600, 300));
		
		Name.setPreferredSize(new Dimension(50, 20));
		Msg.setPreferredSize(new Dimension(2000, 3000));
	
		


		// //////////////
		
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		p.add(Box.createVerticalStrut(20));


		JPanel pSub = new JPanel();
		pSub.setLayout(new BoxLayout(pSub, BoxLayout.Y_AXIS));

		// ////////// 

		JPanel pSuba = new JPanel();
		pSuba.setLayout(new BoxLayout(pSuba, BoxLayout.X_AXIS));
		JLabel s = new JLabel("Username ");
		s.setFont(font1);
		pSuba.add(s);
		pSuba.add(g[0]);
		
		JPanel pSubaa = new JPanel();
		pSubaa.setLayout(new BoxLayout(pSubaa, BoxLayout.Y_AXIS));
		JLabel s1 = new JLabel("Select Username                       ");
		s1.setFont(font1);
		pSubaa.add(s1);
		
		List.setSelectedIndex(5);
		List.addActionListener(this);
		List.setActionCommand("List");
		pSubaa.add(List);
		pSuba.add(pSubaa);
		
		pSub.add(pSuba);
	
		
		// //////////////// 

		JPanel pSubb = new JPanel();
		pSubb.setLayout(new BoxLayout(pSubb, BoxLayout.X_AXIS));
		JLabel sa = new JLabel("Message ");
		sa.setFont(font1);
		
		pSubb.add(sa,BorderLayout.PAGE_START);
		
		JPanel pSubba = new JPanel();
		pSubba.setLayout(new BoxLayout(pSubba, BoxLayout.X_AXIS));
		pSubba.add(g1[0]);
		
		pSub.add(pSubb);
		pSub.add(pSubba);
//////////
		JPanel pSubc = new JPanel();
		pSubc.setLayout(new BoxLayout(pSubc, BoxLayout.X_AXIS));
		
		G.addActionListener(this);
		G.setActionCommand("Get");
		pSubc.add(G);
		
		S.addActionListener(this);
		S.setActionCommand("Send");
		pSubc.add(S);
		pSub.add(pSubc);
		
		//////////////////
		JPanel pSubd = new JPanel();
		pSubd.setLayout(new BoxLayout(pSubd, BoxLayout.X_AXIS));
		JLabel n2 = new JLabel("Color Picker  ");
		pSubd.add(n2);

		PICK.addActionListener(this);
		PICK.setActionCommand("PICK");
		pSubd.add(PICK);
		pSub.add(pSubd);
	
		///////////
		JPanel pSube = new JPanel();
		pSube.setLayout(new BoxLayout(pSube, BoxLayout.X_AXIS));
		pSub.add(pSube);
		
		
		p.add(pSub);
		p.setBackground(new Color (200,200,200));
		this.add(p);
	
	}

	/*
	 * / public void setFrame(JFrame f){ myFrame=f; } //
	 */



	@Override
	public void actionPerformed(ActionEvent arg0) {
		String cmd = arg0.getActionCommand();
		if (cmd.equals("Get")) {

			/////////////////////////
		}
		
		if (cmd.equals("Send")) {

		
			////////////////////////
		}
		if (cmd.equals("List")) {

			
			////////////////////////
		}
		
		if (cmd.equals("PICK")) {

			if (PICK.getText().equals("ON")) {
				PICK.setText("OFF");
				p.setBackground( new Color(200,200,200));
			}
			
	
			else
			{
				PICK.setText("ON");
				Color c = JColorChooser.showDialog(this, "Manual Pick", p.getBackground());
				if (c != null)
				{
					p.setBackground(c);
				}
			}
		}
		
		
	}

		
	public static void main(String[] args) {
		JFrame f = new JFrame("MESSAGER");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		f.setSize(dim.width/2,dim.height);
		f.setBackground(new Color (200,200,200));
		FrontEnd t = new FrontEnd();
		t.init();
		f.setContentPane(t);

		f.pack();
		f.setVisible(true);

	}

}




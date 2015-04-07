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
	public static final Font font = new Font("Castellan", Font.BOLD, 25);
	public static final Font font1 = new Font("Calibri", Font.CENTER_BASELINE,
			20);

	// private JFrame myFrame=new JFrame();

	public void init() {
		
		
		JTextField[] g = { Name };
		JTextArea[] g1 = { Msg };
		this.setPreferredSize(new Dimension(1000, 700));
		
		Name.setPreferredSize(new Dimension(50, 20));
		Msg.setPreferredSize(new Dimension(100, 200));
		
		/////top
		
		JPanel a = new JPanel();
		a.add(Box.createVerticalStrut(10));
		a.setLayout(new BoxLayout(a, BoxLayout.X_AXIS));
		JLabel welc = new JLabel("Welcome");
		welc.setFont(font);
		// welc.setForeground(Color.BLUE);
		a.add(welc, BorderLayout.CENTER);
		a.add(Box.createVerticalStrut(10));
		JButton info=new JButton("Information");
		info.addActionListener(this);
		info.setActionCommand("info");
		a.add(info, BorderLayout.LINE_END);
		a.add(Box.createVerticalStrut(10));



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
		JLabel s1 = new JLabel("Select Username ");
		s.setFont(font1);
		pSubaa.add(s1);
		
		////////////////////////////////////////////////////////////////////////////*ToDo: Dropdown menu*/
		pSuba.add(pSubaa);
		
		pSub.add(pSuba);
		pSub.add(Box.createVerticalStrut(10));
		
		
		
		
		/*R.addActionListener(this);
		R.setActionCommand("Red");
		pSuba.add(R);*/
		pSub.add(pSuba);
		pSub.add(Box.createVerticalStrut(10));
		// //////////////// 

		JPanel pSubb = new JPanel();
		pSubb.setLayout(new BoxLayout(pSubb, BoxLayout.Y_AXIS));
		JLabel sa = new JLabel("Message ");
		sa.setFont(font1);
		pSubb.add(sa);
		pSuba.add(g1[0]);
		/*G.addActionListener(this);
		G.setActionCommand("Green");
		pSubb.add(G);*/
		pSub.add(pSubb);
		pSub.add(Box.createVerticalStrut(10));
//////////
		JPanel pSubc = new JPanel();
		pSubc.setLayout(new BoxLayout(pSubc, BoxLayout.X_AXIS));
		JLabel n1 = new JLabel("Click this to make the window Blue ");
		n1.setFont(font1);
		pSubc.add(n1);

		B.addActionListener(this);
		B.setActionCommand("Blue");
		pSubc.add(B);
		pSub.add(pSubc);
		pSub.add(Box.createVerticalStrut(10));
		//////////////////
		JPanel pSubd = new JPanel();
		pSubd.setLayout(new BoxLayout(pSubd, BoxLayout.X_AXIS));
		JLabel n2 = new JLabel("Color Picker  ");
		n2.setFont(font1);
		pSubd.add(n2);

		PICK.addActionListener(this);
		PICK.setActionCommand("PICK");
		pSubd.add(PICK);
		pSub.add(pSubd);
		pSub.add(Box.createVerticalStrut(20));
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
		if (cmd.equals("Red")) {

			if (R.getText().equals("ON")) {
				R.setText("OFF");
				p.setBackground(new Color(200,200,200));
			}
			else
			{
				R.setText("ON");
				G.setText("OFF");
				B.setText("OFF");
				PICK.setText("OFF");
				p.setBackground(new Color(200,0,0));
			}
		}
		
		if (cmd.equals("Green")) {

			if (G.getText().equals("ON")) {
				G.setText("OFF");
				p.setBackground(new Color(200,200,200));
			}
			else
			{
				G.setText("ON");
				R.setText("OFF");
				B.setText("OFF");
				PICK.setText("OFF");
				p.setBackground(new Color(0,200,0));
			}
		}
		
		if (cmd.equals("Blue")) {

			if (B.getText().equals("ON")) {
				B.setText("OFF");
				p.setBackground( new Color(200,200,200));
			}
			else
			{
				B.setText("ON");
				G.setText("OFF");
				R.setText("OFF");
				PICK.setText("OFF");
				p.setBackground( new Color(0,0,200));
			}
		}
		
		if (cmd.equals("PICK")) {

			if (PICK.getText().equals("ON")) {
				PICK.setText("OFF");
				p.setBackground( new Color(200,200,200));
			}
			else
			{
				PICK.setText("ON");
				G.setText("OFF");
				B.setText("OFF");
				R.setText("OFF");
				Color c = JColorChooser.showDialog(this, "Manual Pick", p.getBackground());
				if (c != null)
				{
					p.setBackground(c);
				}
			}
		}
		
		
	}

		
	public static void main(String[] args) {
		JFrame f = new JFrame("Tatiana Larina, Batu Ozsaracoglu");
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




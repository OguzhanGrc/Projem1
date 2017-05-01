package kim500milyarister;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;

public class Soru2 extends JFrame implements  ActionListener{

	private JPanel contentPane;
	private JButton btnizmir;
	
	private JButton btnist;
	
	private JButton btnCKonya ;
	
	private JButton btnDAnkara ;
	 public int sayi=0;
	 private JButton btn7500;
		private JButton btn500; 
		Timer zamanlayýcýqq =new Timer();

		private JButton btn1000 ;
	    private	JButton btn2000 ;
		private JButton btn3000;
		private JButton btn5000;
		private JButton btn15000;
		private JButton btnotuz;
		private JButton btn60;
		private JButton btn125 ;
		private JButton btn250 ;
		private JButton btnmilyon;
		private JButton btn0tl;
		private JButton button;
		private JButton button_1;
		private JButton button_2;
		private JButton button_3;
		private JButton button_4;
		private JButton button_5;
		private JButton button_6;
		private JButton button_7;
		private JButton button_8;
		private JButton button_9;
		private JButton button_10;
		private JButton button_11;
		private JButton button_12;
		private JButton button_13;
		private JButton button_14;
		private JButton button_15;
		private JButton btnNewButton;
		private JButton btnNewButton_1;
		private JButton btnbasla;
		private JButton btnsýradaki;
		private JPanel panel;
		private JLabel lblNewLabel_1;
		private JLabel lblNewLabel_2;
		private JButton btnyuzde;
		File surec= new File("C:\\Users\\USER\\Desktop\\surec.WAV");
		File yanlis= new File("C:\\Users\\USER\\Desktop\\yanlis.WAV");
		File secim= new File("C:\\Users\\USER\\Desktop\\siksecim.WAV");
		File gecis= new File("C:\\Users\\USER\\Desktop\\sorugecisi.WAV");
		static Clip clip;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Soru2 frame = new Soru2();
					frame.setVisible(true);
					 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Soru2() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 739, 693);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnizmir = new JButton("A) \u0130zmir");
		btnizmir.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnizmir.setForeground(Color.BLACK);
		btnizmir.setBounds(77, 424, 141, 68);
		btnizmir.setVisible(false);
		btnizmir.addActionListener(this);
		
		btnsýradaki = new JButton("S\u0131radaki soru");
		btnsýradaki.setBackground(Color.CYAN);
		btnsýradaki.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnsýradaki.setBounds(432, 573, 119, 54);
		btnsýradaki.setVisible(false);
		btnsýradaki.addActionListener(this);
		contentPane.add(btnsýradaki);
		
		btnyuzde = new JButton("%50 Joker");
		btnyuzde.setForeground(Color.BLUE);
		btnyuzde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnizmir.setVisible(false);
				btnCKonya.setVisible(false);
			}
		});
		btnyuzde.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnyuzde.setBackground(Color.YELLOW);
		btnyuzde.setBounds(383, 125, 114, 63);
		contentPane.add(btnyuzde);
		
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 330, 505, 83);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("T\u00FCrkiye'nin ba\u015Fkenti neresidir?");
		lblNewLabel.setBounds(110, 30, 277, 21);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		contentPane.add(btnizmir);
		
		btnist = new JButton("B) \u0130stanbul");
		btnist.setForeground(Color.BLACK);
		btnist.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnist.setBounds(299, 424, 123, 68);
		btnist.setVisible(false);
		btnist.addActionListener(this);
		contentPane.add(btnist);
		
	    btnCKonya = new JButton("C) Konya");
	    btnCKonya.setForeground(Color.BLACK);
	    btnCKonya.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnCKonya.setBounds(77, 508, 141, 63);
		btnCKonya.addActionListener(this);
		btnCKonya.setVisible(false);
		contentPane.add(btnCKonya);
		
	    btnDAnkara = new JButton("D) Ankara");
	    btnDAnkara.setForeground(Color.BLACK);
	    btnDAnkara.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnDAnkara.setBounds(299, 507, 123, 64);
		btnDAnkara.setVisible(false);
		btnDAnkara.addActionListener(this);
		contentPane.add(btnDAnkara);
		
	    btnmilyon = new JButton("1000000 TL");
		btnmilyon.setForeground(Color.MAGENTA);
		btnmilyon.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnmilyon.setBackground(Color.BLACK);
		btnmilyon.setBounds(572, 11, 141, 36);
		contentPane.add(btnmilyon);
		
		 btn250 = new JButton("250000TL");
		btn250.setForeground(Color.MAGENTA);
		btn250.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn250.setBackground(Color.BLACK);
		btn250.setBounds(594, 58, 115, 36);
		contentPane.add(btn250);
		
		 btn125 = new JButton("125000 TL");
		btn125.setForeground(Color.MAGENTA);
		btn125.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn125.setBackground(Color.BLACK);
		btn125.setBounds(608, 105, 105, 36);
		contentPane.add(btn125);
		
		 btn60 = new JButton("60000 TL");
		btn60.setForeground(Color.MAGENTA);
		btn60.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn60.setBackground(Color.BLACK);
		btn60.setBounds(608, 152, 105, 36);
		contentPane.add(btn60);
		
	 btnotuz = new JButton("30000 TL");
		btnotuz.setForeground(Color.MAGENTA);
		btnotuz.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnotuz.setBackground(Color.BLACK);
		btnotuz.setBounds(608, 198, 105, 36);
		contentPane.add(btnotuz);
	
		btn15000 = new JButton("15000 TL");
		btn15000.setForeground(Color.MAGENTA);
		btn15000.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn15000.setBackground(Color.BLACK);
		btn15000.setBounds(608, 254, 105, 36);
		contentPane.add(btn15000);
		
		 btn7500 = new JButton("7500 TL");
		btn7500.setForeground(Color.MAGENTA);
		btn7500.setBackground(Color.BLACK);
		btn7500.setBounds(608, 301, 105, 46);
		contentPane.add(btn7500);
		
		 btn5000 = new JButton("5000 TL");
		btn5000.setForeground(Color.MAGENTA);
		btn5000.setBackground(Color.BLACK);
		btn5000.setBounds(608, 358, 105, 36);
		contentPane.add(btn5000);
		
	 btn3000 = new JButton("3000 TL");
		btn3000.setForeground(Color.MAGENTA);
		btn3000.setBackground(Color.BLACK);
		btn3000.setBounds(608, 409, 105, 36);
		contentPane.add(btn3000);
		
		 btn2000 = new JButton("2000 TL");
		btn2000.setForeground(Color.MAGENTA);
		btn2000.setBackground(Color.BLACK);
		btn2000.setBounds(608, 456, 105, 36);
		contentPane.add(btn2000);
		
 btn1000 = new JButton("1000 TL");
		btn1000.setForeground(Color.MAGENTA);
		btn1000.setBackground(Color.BLACK);
		btn1000.setBounds(623, 515, 90, 33);
		contentPane.add(btn1000);
		
	 btn500 = new JButton(" 500 TL");
		btn500.setForeground(Color.MAGENTA);
		btn500.setBackground(Color.BLACK);
		btn500.setBounds(627, 570, 86, 23);
		contentPane.add(btn500);
		
        btn0tl = new JButton(" 0 TL");
		btn0tl.setForeground(Color.MAGENTA);
		btn0tl.setBackground(Color.BLACK);
		btn0tl.setBounds(627, 609, 86, 23);
		contentPane.add(btn0tl);
		
		button = new JButton("");
		button.setBackground(SystemColor.inactiveCaption);
		button.setBounds(103, 289, 15, 23);
		contentPane.add(button);
		
		button_1 = new JButton("");
		button_1.setBounds(128, 289, 15, 23);
		contentPane.add(button_1);
		
		button_2 = new JButton("");
		button_2.setBounds(153, 289, 15, 23);
		contentPane.add(button_2);
		
		button_3 = new JButton("");
		button_3.setBounds(178, 289, 15, 23);
		contentPane.add(button_3);
		
		button_4 = new JButton("");
		button_4.setBounds(203, 289, 15, 23);
		contentPane.add(button_4);
		
		button_5 = new JButton("");
		button_5.setBounds(228, 289, 15, 23);
		contentPane.add(button_5);
		
		button_6 = new JButton("");
		button_6.setBounds(253, 289, 15, 23);
		contentPane.add(button_6);
		
		button_7 = new JButton("");
		button_7.setBounds(278, 289, 15, 23);
		contentPane.add(button_7);
		
		button_8 = new JButton("");
		button_8.setBounds(303, 289, 15, 23);
		contentPane.add(button_8);
		
		button_9 = new JButton("");
		button_9.setBounds(328, 289, 15, 23);
		contentPane.add(button_9);
		
		button_10 = new JButton("");
		button_10.setBounds(353, 289, 15, 23);
		contentPane.add(button_10);
		
		button_11 = new JButton("");
		button_11.setBounds(378, 289, 15, 23);
		contentPane.add(button_11);
		
		button_12 = new JButton("");
		button_12.setBounds(407, 289, 15, 23);
		contentPane.add(button_12);
		
		button_13 = new JButton("");
		button_13.setBounds(432, 289, 15, 23);
		contentPane.add(button_13);
		
		button_14 = new JButton("");
		button_14.setBounds(457, 289, 15, 23);
		contentPane.add(button_14);
		
		button_15 = new JButton("");
		button_15.setBounds(482, 289, 15, 23);
		contentPane.add(button_15);
		
		btnNewButton = new JButton("");
		btnNewButton.setBounds(37, 289, 15, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(70, 289, 15, 23);
		contentPane.add(btnNewButton_1);
		
		btnbasla = new JButton("");
		btnbasla.setIcon(new ImageIcon("C:\\OGURCU\\resimler\\b4e2aa02_Start-Button.png"));
		btnbasla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			sesCalintro(surec);
				
			if(jokerdurum(sayi)==1)
			{
				btnyuzde.setVisible(false);
			
			   
			
			}else{ 
			}
					süre();
				
			}
		});
		btnbasla.setBounds(10, 196, 211, 55);
		contentPane.add(btnbasla);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\OGURCU\\resimler\\1_d.jpg"));
		lblNewLabel_1.setBounds(-256, -24, 1037, 780);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("K\u0130M 1.000.000 TL \u0130STER");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(125, 11, 588, 49);
		contentPane.add(lblNewLabel_2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton basýlanbuton=(JButton) e.getSource();
		String butonismi=basýlanbuton.getText();
		
		
		switch (butonismi) {
		case "A) \u0130zmir":
			clip.stop();
			sesCalintro(secim);
			btnbasla.setVisible(false);
			btnist.setVisible(false);
			btnDAnkara.setVisible(false);
			btnCKonya.setVisible(false);
			btnyuzde.setVisible(false);
			
			REnkler();
			zamanlayýcýqq.cancel();
			//JOptionPane.showMessageDialog(this, "message", "title", JOptionPane.PLAIN_MESSAGE);
Timer zamanlayýcý=new Timer();
			
			TimerTask görev=new  TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
						btnizmir.setBackground(Color.ORANGE);
						
						
						
					
				}
			};
			zamanlayýcý.schedule(görev, 0, 100000);
			TimerTask görev2= new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					clip.stop();
					
					sesCalintro(yanlis);
					btnizmir.setBackground(Color.RED);
					JOptionPane.showMessageDialog(null, "Ödülünüz 0 TL", "Durum", JOptionPane.PLAIN_MESSAGE);
					
					btn0tl.setBackground(Color.GREEN);
					
					
				}
			}; zamanlayýcý.schedule(görev2, 5000, 10000);
			
			btnizmir.setBackground(Color.RED);
			
			
			
			break;

		case "B) \u0130stanbul":	
			clip.stop();
			sesCalintro(secim);
			
			btnbasla.setVisible(false);
			REnkler();
			btnizmir.setVisible(false);
			btnCKonya.setVisible(false);
			btnDAnkara.setVisible(false);
			btnyuzde.setVisible(false);
			
			zamanlayýcýqq.cancel();
   Timer zamanlayýcý2=new Timer();
			
			TimerTask görev3=new  TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
						btnist.setBackground(Color.ORANGE);
						
						
						
					
				}
			};
			zamanlayýcý2.schedule(görev3, 0, 100000);
			TimerTask görev4= new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					clip.stop();
					sesCalintro(yanlis);
					btnist.setBackground(Color.RED);
					JOptionPane.showMessageDialog(null, "Ödülünüz 0 TL", "Durum", JOptionPane.PLAIN_MESSAGE);
					
					btn0tl.setBackground(Color.GREEN);
					
					
				}
			}; zamanlayýcý2.schedule(görev4, 5000, 10000);
			
			btnist.setBackground(Color.RED);
			
			
			
			break;
		case "C) Konya" :
			clip.stop();
			sesCalintro(secim);
			
			btnbasla.setVisible(false);
			btnizmir.setVisible(false);
			btnDAnkara.setVisible(false);
			btnist.setVisible(false);
			btnyuzde.setVisible(false);
			REnkler();
			zamanlayýcýqq.cancel();
Timer zamanlayýcý3=new Timer();
			
			TimerTask görev5=new  TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
						btnCKonya.setBackground(Color.ORANGE);
						
						
					
				}
			};
			zamanlayýcý3.schedule(görev5, 0, 100000);
			TimerTask görev6= new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					clip.stop();
					sesCalintro(yanlis);
					btnCKonya.setBackground(Color.RED);
					JOptionPane.showMessageDialog(null, "Ödülünüz 0 TL", "Durum", JOptionPane.PLAIN_MESSAGE);
					btn0tl.setBackground(Color.GREEN);
					
					
					
				}
			}; zamanlayýcý3.schedule(görev6, 5000, 10000);
			
			btnCKonya.setBackground(Color.RED);
			
			
			break;
		case "D) Ankara" :
		clip.stop();
		
			
			btnbasla.setVisible(false);
            btnizmir.setVisible(false);		
			btnCKonya.setVisible(false);
			btnist.setVisible(false);
			btnyuzde.setVisible(false);
			
			REnkler();
			zamanlayýcýqq.cancel();
Timer zamanlayýcý5=new Timer();
			
			TimerTask görev7=new  TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
				
						btnDAnkara.setBackground(Color.ORANGE);
						
						
						
					
				}
			};
			zamanlayýcý5.schedule(görev7, 0, 100000);
			Timer zamanlayýcý6=new Timer();
			TimerTask görev8= new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					//btn500.setBackground(Color.GREEN);
				
					
					btnDAnkara.setBackground(Color.GREEN);
					
					
					
					
				}
			}; zamanlayýcý6.schedule(görev8, 1200,250);
			
			
			Timer zamanlayýcý4=new Timer();
			TimerTask görev9=new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
				
					btnDAnkara.setBackground(Color.BLACK);

                           sayi++;
					if(sayi==8){
						zamanlayýcý4.cancel();
					}
				}
			}; zamanlayýcý4.schedule(görev9,1400,250);
			Timer zaman5=new Timer();
			TimerTask görevödül=new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					btn0tl.setBackground(Color.GREEN);
				
					btn500.setBackground(Color.GREEN);
					btn1000.setBackground(Color.GREEN);
					btnsýradaki.setVisible(true);
				}
			};zaman5.schedule(görevödül, 1200, 1);
			
			
		   break;
		   
		case "%50 Joker" :
			
			
			
			
			
			break;
		case "Sýradaki soru" :
			clip.stop();
			sesCalintro(gecis);
			
			
			Soru3 soru3=new Soru3();
			soru3.setVisible(true);
			close();
		default:
			break;
		}
		
	}

	public  void REnkler(){
		
		
		Timer zamanlayýcýx=new Timer();
	TimerTask görev0=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn0tl.setBackground(Color.ORANGE);
				
				
			}
		};zamanlayýcýx.schedule(görev0, 90, 10000);
		TimerTask görevx=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn500.setBackground(Color.ORANGE);
				
				
			}
		};zamanlayýcýx.schedule(görevx, 120, 100000);
		
		TimerTask görevy=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn1000.setBackground(Color.ORANGE);
			}
		}; zamanlayýcýx.schedule(görevy, 150, 10000);
		TimerTask görevz=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn2000.setBackground(Color.ORANGE);
			}
		};zamanlayýcýx.schedule(görevz, 180, 250);
		TimerTask göreva=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn3000.setBackground(Color.ORANGE);
			}
		};zamanlayýcýx.schedule(göreva, 210, 250);
	      TimerTask görevb=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn5000.setBackground(Color.ORANGE);
			}
		};zamanlayýcýx.schedule(görevb, 240, 250);
		
	TimerTask görevc=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn7500.setBackground(Color.ORANGE);
			}
		};zamanlayýcýx.schedule(görevc, 270, 250);
		
	TimerTask görevd=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn15000.setBackground(Color.ORANGE);
			}
		};zamanlayýcýx.schedule(görevd, 300, 250);
		
	TimerTask göreve=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btnotuz.setBackground(Color.ORANGE);
			}
		};zamanlayýcýx.schedule(göreve, 330, 250);
	TimerTask görevf=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn60.setBackground(Color.ORANGE);
			}
		};zamanlayýcýx.schedule(görevf, 360, 250);
	TimerTask görevg=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn125.setBackground(Color.ORANGE);
			}
		};zamanlayýcýx.schedule(görevg, 390, 250);
	TimerTask görevh=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn250.setBackground(Color.ORANGE);
			}
		};zamanlayýcýx.schedule(görevh,420, 250);
	TimerTask görevj=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btnmilyon.setBackground(Color.ORANGE);
			}
		};zamanlayýcýx.schedule(görevj, 450, 250);
	}
	public void süre(){
		
		btnCKonya.setVisible(true);
		btnDAnkara.setVisible(true);
		btnizmir.setVisible(true);
		btnist.setVisible(true);
		TimerTask görev1=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btnNewButton.setBackground(Color.GREEN);
			}
		};zamanlayýcýqq.schedule(görev1, 1000, 1);
		
		
		TimerTask görev2=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btnNewButton_1.setBackground(Color.GREEN);
								}
		};zamanlayýcýqq.schedule(görev2, 2000, 1);
		
		
		
		TimerTask görev3=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button.setBackground(Color.GREEN);
			}
		};zamanlayýcýqq.schedule(görev3, 3000, 1);
		
		
		TimerTask görev4=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_1.setBackground(Color.YELLOW);
			}
		};zamanlayýcýqq.schedule(görev4, 4000, 1);
	TimerTask görev4a=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_2.setBackground(Color.YELLOW);
			}
		};zamanlayýcýqq.schedule(görev4a, 5000, 1);
		
		TimerTask görev5=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_3.setBackground(Color.YELLOW);
			}
		};zamanlayýcýqq.schedule(görev5, 6000, 1);
	TimerTask görev6=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_4.setBackground(Color.ORANGE);
			}
		};zamanlayýcýqq.schedule(görev6, 7000, 1);
	TimerTask görev7=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_5.setBackground(Color.ORANGE);
			}
		};zamanlayýcýqq.schedule(görev7, 8000, 1);
	TimerTask görev8=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_6.setBackground(Color.ORANGE);
			}
		};zamanlayýcýqq.schedule(görev8, 9000, 1);
	TimerTask görev9=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_7.setBackground(Color.RED);
			}
		};zamanlayýcýqq.schedule(görev9, 10000, 1);
	    TimerTask görev10=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_8.setBackground(Color.RED);
			}
		};zamanlayýcýqq.schedule(görev10, 11000, 1);
		
	    TimerTask görev11=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_9.setBackground(Color.RED);
			}
		};zamanlayýcýqq.schedule(görev11, 12000, 1);

	    TimerTask görev12=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_10.setBackground(Color.RED);
			}
		};zamanlayýcýqq.schedule(görev12, 13000, 1);

TimerTask görev12b=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_11.setBackground(Color.RED);
			}
		};zamanlayýcýqq.schedule(görev12b, 14000, 1);
	TimerTask görev13=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_12.setBackground(Color.RED);
			}
		};zamanlayýcýqq.schedule(görev13, 15000, 1);
	TimerTask görev14=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_13.setBackground(Color.RED);
			}
		};zamanlayýcýqq.schedule(görev14, 16000, 1);


	TimerTask görev15=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_14.setBackground(Color.RED);
			}
		};zamanlayýcýqq.schedule(görev15, 17000, 1);
	TimerTask görev16=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_15.setBackground(Color.RED);
				btnizmir.setVisible(false);
				btnist.setVisible(false);
				btnCKonya.setVisible(false);
				btnDAnkara.setVisible(false);
				
				btnbasla.setVisible(false);
				btnyuzde.setVisible(false);
				
				JOptionPane.showMessageDialog(null, "Ödülünüz 0 TL. Doðru þýk : D ", "Durum", JOptionPane.PLAIN_MESSAGE);
			btn0tl.setBackground(Color.GREEN);
			}
		};zamanlayýcýqq.schedule(görev16, 18000, 10000);}
	
public static int jokerdurum(int sayi){
	
	if(sayi==1){
		return 1;
	}else{
		return 0;
	}
}

public static void sesCalintro(File ses){
	try {
	    clip=AudioSystem.getClip();
		clip.open(AudioSystem.getAudioInputStream(ses));
		clip.start();
		
		Thread.sleep(0000);
		
		
	} catch (Exception e) {
		
	}
	
	
}

public static void sesKesintro(File ses){
	try {
		 clip=AudioSystem.getClip();
		clip.open(AudioSystem.getAudioInputStream(ses));
		
		clip.stop();
		
		
		
	} catch (Exception e) {
		
	}
	
	
}

public void close(){
	
	WindowEvent altekrankapat=new WindowEvent(this,WindowEvent.WINDOW_CLOSING );
	Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(altekrankapat);
	
	
}
}
	




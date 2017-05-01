package kim500milyarister;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.sound.sampled.*;
import javax.sql.rowset.Joinable;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ButtonUI;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.*;
import java.awt.event.ActionEvent;
import java.util.*;
import java.awt.SystemColor;
import java.awt.Rectangle;
import java.awt.Point;
import java.awt.ComponentOrientation;
import java.awt.Frame;
import java.awt.Dimension;
public class Bilesenler extends JFrame implements ActionListener{
    
	private static int sayac=0;
	
    

	private JPanel contentPane;
	private JButton btnamuzo;
	private JButton btnCHega;
	private JButton btnGrc ;
	private JButton btnDen ;
	
	private JButton btn7500;
	private JButton btn500; 
	int sayi=0;

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
 private JLabel lblNewLabel_2 ;
private JButton btnbasla ;
private JButton btnNewButton ;
private JButton btnNewButton_1; 
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
Timer zamanlayýcýqq=new Timer();
/**
 * 
 */

private JButton button_12;
private JButton button_13;
private JButton button_14;
private JButton button_15;
private JButton btnsýradaki;
private JLabel lblNewLabel_1;
private JLabel lblNewLabel_3;
private JPanel panel;
private JButton btnNewButton_2;
File surec= new File("C:\\Users\\USER\\Desktop\\surec.WAV");
File yanlis= new File("C:\\Users\\USER\\Desktop\\yanlis.WAV");
File secim= new File("C:\\Users\\USER\\Desktop\\siksecim.WAV");
File gecis= new File("C:\\Users\\USER\\Desktop\\sorugecisi.WAV");
File dogru= new File("C:\\Users\\USER\\Desktop\\dogru.WAV");

static Clip clip;
/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bilesenler frame = new Bilesenler();
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
	public Bilesenler() {
		setPreferredSize(new Dimension(150, 150));
		setBackground(Color.ORANGE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\OGURCU\\resimler\\1_d.jpg"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 737, 694);
		contentPane = new JPanel();
		contentPane.setBounds(new Rectangle(100, 100, 100, 100));
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton_2 = new JButton("%50 Joker");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			      
			           sayac=1;
			   
			       
			    Soru2.jokerdurum(sayac);
			       
			         btnamuzo.setVisible(false);
			         btnCHega.setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_2.setBackground(Color.YELLOW);
		btnNewButton_2.setBounds(420, 167, 123, 60);
		contentPane.add(btnNewButton_2);
		
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(75, 315, 502, 84);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel_3 = new JLabel("A\u015Fa\u011F\u0131dakilerden hangisi O\u011Fuzhan' \u0131n soyad\u0131d\u0131r?");
		lblNewLabel_3.setBounds(41, 27, 383, 20);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setIcon(null);
		lblNewLabel_3.setBackground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		
		JLabel lblNewLabel = new JLabel("Kim 1000000 TL \u0130STER?");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 29));
		lblNewLabel.setBounds(156, 11, 381, 46);
		contentPane.add(lblNewLabel);
		
	    btnamuzo = new JButton("A) Muzo");
	    btnamuzo.setSelectedIcon(null);
		
		btnamuzo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnamuzo.setForeground(Color.BLACK);
		btnamuzo.setBackground(Color.LIGHT_GRAY);
		btnamuzo.setVisible(false);
		btnamuzo.setBounds(145, 415, 133, 52);
		btnamuzo.addActionListener(this);
		contentPane.add(btnamuzo);
		
		 btnGrc = new JButton("B) G\u00FCrc\u00FC");
		btnGrc.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnGrc.setBackground(Color.LIGHT_GRAY);
	btnGrc.setVisible(false);
		btnGrc.setForeground(Color.BLACK);
		btnGrc.setBounds(395, 415, 123, 55);
		btnGrc.addActionListener(this);
		contentPane.add(btnGrc);
		
	    btnCHega = new JButton("C) Hega");
		btnCHega.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnCHega.setForeground(Color.BLACK);
		btnCHega.setVisible(false);
		btnCHega.setBackground(Color.LIGHT_GRAY);
		btnCHega.setBounds(145, 492, 133, 57);
		btnCHega.addActionListener(this);
		contentPane.add(btnCHega);
		
		 btnDen = new JButton("D) \u015Een");
		btnDen.setForeground(Color.BLACK);
		btnDen.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnDen.setBackground(Color.LIGHT_GRAY);
		btnDen.setVisible(false);
		btnDen.setBounds(395, 492, 123, 57);
		btnDen.addActionListener(this);
		contentPane.add(btnDen);
		
		 btn1000 = new JButton("1000 TL");
		btn1000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn1000.setForeground(Color.MAGENTA);
		btn1000.setBackground(Color.BLACK);
		btn1000.setBounds(630, 512, 89, 33);
		contentPane.add(btn1000);
		
		 btn500 = new JButton(" 500 TL");
		btn500.setForeground(Color.MAGENTA);
		btn500.setBackground(Color.BLACK);
		btn500.setBounds(634, 570, 85, 23);
		contentPane.add(btn500);
		
		btn2000 = new JButton("2000 TL");
		btn2000.setForeground(Color.MAGENTA);
		btn2000.setBackground(Color.BLACK);
		btn2000.setBounds(618, 465, 101, 36);
		contentPane.add(btn2000);
		
		 btn3000 = new JButton("3000 TL");
		btn3000.setForeground(Color.MAGENTA);
		btn3000.setBackground(Color.BLACK);
		btn3000.setBounds(614, 415, 105, 36);
		contentPane.add(btn3000);
		
	    btn5000 = new JButton("5000 TL");
		btn5000.setForeground(Color.MAGENTA);
		btn5000.setBackground(Color.BLACK);
		btn5000.setBounds(614, 354, 105, 36);
		contentPane.add(btn5000);
		
		btn7500 = new JButton("7500 TL");
		btn7500.setForeground(Color.MAGENTA);
		btn7500.setBackground(Color.BLACK);
		btn7500.setBounds(614, 296, 105, 36);
		contentPane.add(btn7500);
		
	    btn15000 = new JButton("15000 TL");
		btn15000.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn15000.setForeground(Color.MAGENTA);
		btn15000.setBackground(Color.BLACK);
		btn15000.setBounds(608, 238, 105, 36);
		contentPane.add(btn15000);
		
	    btnotuz = new JButton("30000 TL");
		btnotuz.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnotuz.setForeground(Color.MAGENTA);
		btnotuz.setBackground(Color.BLACK);
		btnotuz.setBounds(608, 191, 105, 36);
		contentPane.add(btnotuz);
		
	    btn60 = new JButton("60000 TL");
		btn60.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn60.setForeground(Color.MAGENTA);
		btn60.setBackground(Color.BLACK);
		btn60.setBounds(608, 144, 105, 36);
		contentPane.add(btn60);
		
		 btn125 = new JButton("125000 TL");
		btn125.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn125.setForeground(Color.MAGENTA);
		btn125.setBackground(Color.BLACK);
		btn125.setBounds(590, 97, 123, 36);
		contentPane.add(btn125);
		
		 btn250 = new JButton("250000TL");
		btn250.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn250.setForeground(Color.MAGENTA);
		btn250.setBackground(Color.BLACK);
		btn250.setBounds(580, 50, 139, 36);
		contentPane.add(btn250);
		
		 btnmilyon = new JButton("1000000 TL");
		btnmilyon.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnmilyon.setForeground(Color.MAGENTA);
		btnmilyon.setBackground(Color.BLACK);
		btnmilyon.setBounds(562, 0, 149, 39);
		contentPane.add(btnmilyon);
		
		 btn0tl = new JButton(" 0 TL");
		btn0tl.setForeground(Color.MAGENTA);
		btn0tl.setBackground(Color.BLACK);
		btn0tl.setBounds(634, 604, 85, 23);
		contentPane.add(btn0tl);
		
	 btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setBounds(96, 281, 15, 23);
		contentPane.add(btnNewButton);
		
		 btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(120, 281, 15, 23);
		contentPane.add(btnNewButton_1);
		
		button = new JButton("");
		button.setBounds(145, 281, 15, 23);
		contentPane.add(button);
		
		 button_1 = new JButton("");
		button_1.setBounds(170, 281, 15, 23);
		contentPane.add(button_1);
		
		 button_2 = new JButton("");
		button_2.setBounds(195, 281, 15, 23);
		contentPane.add(button_2);
		
		button_3 = new JButton("");
		button_3.setBounds(220, 281, 15, 23);
		contentPane.add(button_3);
		
		 button_4 = new JButton("");
		button_4.setBounds(245, 281, 15, 23);
		contentPane.add(button_4);
		
		 button_5 = new JButton("");
		button_5.setBounds(270, 281, 15, 23);
		contentPane.add(button_5);
		
		 button_6 = new JButton("");
		button_6.setBounds(295, 281, 15, 23);
		contentPane.add(button_6);
		
	    button_7 = new JButton("");
		button_7.setBounds(320, 281, 15, 23);
		contentPane.add(button_7);
		
		button_8 = new JButton("");
		button_8.setBounds(345, 281, 15, 23);
		contentPane.add(button_8);
		
		button_9 = new JButton("");
		button_9.setBounds(370, 281, 15, 23);
		contentPane.add(button_9);
		
		 button_10 = new JButton("");
		button_10.setBounds(395, 281, 15, 23);
		contentPane.add(button_10);
		
		 btnbasla = new JButton("Ba\u015Fla");
		 btnbasla.setIcon(new ImageIcon("C:\\OGURCU\\resimler\\b4e2aa02_Start-Button.png"));
		 btnbasla.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		 btnbasla.setForeground(Color.RED);
		btnbasla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				//JOptionPane.showMessageDialog(null, "message", "title", JOptionPane.PLAIN_MESSAGE);

				btnamuzo.setVisible(true);
				btnGrc.setVisible(true);
				btnCHega.setVisible(true);
				btnDen.setVisible(true);
				süre();
				sesCalintro(surec);
			
		    
		
		
		
			}
	});
		btnbasla.setBounds(34, 106, 233, 55);
		btnbasla.addActionListener(this);
		contentPane.add(btnbasla);
		
		button_12 = new JButton("");
		button_12.setBounds(420, 281, 15, 23);
		contentPane.add(button_12);
		
		button_13 = new JButton("");
		button_13.setBounds(445, 281, 15, 23);
		contentPane.add(button_13);
		
		button_14 = new JButton("");
		button_14.setBounds(474, 281, 15, 23);
		contentPane.add(button_14);
		
		button_15 = new JButton("");
		button_15.setBounds(499, 281, 15, 23);
		contentPane.add(button_15);
		
		btnsýradaki = new JButton("S\u0131radaki soru");
		btnsýradaki.setBackground(Color.CYAN);
		btnsýradaki.setForeground(Color.BLUE);
		btnsýradaki.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnsýradaki.addActionListener(this);
		btnsýradaki.setVisible(false);
			
		btnsýradaki.setBounds(462, 594, 119, 41);
		contentPane.add(btnsýradaki);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\OGURCU\\resimler\\1_d.jpg"));
		lblNewLabel_1.setBounds(-175, -23, 911, 769);
		contentPane.add(lblNewLabel_1);
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		JButton basýlanbuton=(JButton) e.getSource();
		String butonismi=basýlanbuton.getText();
		switch (butonismi) {
		case "A) Muzo":
			//JOptionPane.showMessageDialog(this, "message", "title", JOptionPane.PLAIN_MESSAGE);
		
		
			clip.stop();
			
			Timer sesara=new  Timer();
			TimerTask s=new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					sesCalintro(secim);
				}
			};
			
			sesara.schedule(s,0,100000);
			TimerTask s2=new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
				}
			}; sesara.schedule(s2, 20000, 100000);
			
			btnNewButton_2.setVisible(false);
			btnGrc.setVisible(false);
			btnCHega.setVisible(false);
			btnDen.setVisible(false);
			
			
			btnbasla.setVisible(false);
			REnkler();
			zamanlayýcýqq.cancel();
			Timer zamanlayýcý=new Timer();
			
			TimerTask görev=new  TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					    
						btnamuzo.setBackground(Color.ORANGE);
						sayac++;
						
						
					
				}
			};
			zamanlayýcý.schedule(görev, 0, 100000);
			TimerTask görev2= new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					clip.stop();
					sesCalintro(yanlis);
					btnamuzo.setBackground(Color.RED);
					JOptionPane.showMessageDialog(null, "Ödülünüz 0 TL", "Durum", JOptionPane.PLAIN_MESSAGE);
					
					btn0tl.setBackground(Color.GREEN);
					
					
				}
			}; zamanlayýcý.schedule(görev2, 5000, 100000);
			
			btnamuzo.setBackground(Color.RED);
			
			break;
		case  "B) G\u00FCrc\u00FC" :
			//JOptionPane.showMessageDialog(this, "message", "title", JOptionPane.PLAIN_MESSAGE);
		clip.stop();
			sesCalintro(secim);
			btnNewButton_2.setVisible(false);
		   btnbasla.setVisible(false);
		   
		   btnamuzo.setVisible(false);
		   btnCHega.setVisible(false);
		   btnDen.setVisible(false);
		   REnkler();
		   zamanlayýcýqq.cancel();
			Timer zamanlayýcý2=new Timer();
			
			TimerTask görev3=new  TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
				
						btnGrc.setBackground(Color.ORANGE);
						sayac++;
						
						
					
				}
			};
			zamanlayýcý2.schedule(görev3, 0, 100000);
			Timer zamanlayýcý3=new Timer();
			TimerTask görev4= new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					//btn500.setBackground(Color.GREEN);
				
					
					btnGrc.setBackground(Color.GREEN);
					
					
					
					
					
				}
			}; zamanlayýcý3.schedule(görev4, 2500,250);
			TimerTask ses=new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					 clip.stop();
					 sesCalintro(dogru);
				}
			}; zamanlayýcý3.schedule(ses, 2500, 250000);
			
			Timer zamanlayýcý4=new Timer();
			TimerTask görev5=new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					btnGrc.setBackground(Color.BLACK);

                           sayi++;
					if(sayi==8){
						zamanlayýcý4.cancel();
					}
				}
			}; zamanlayýcý4.schedule(görev5,2700,250);
			Timer zaman5=new Timer();
			TimerTask görevödül=new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					btn0tl.setBackground(Color.GREEN);
				
					btn500.setBackground(Color.GREEN);
					btnsýradaki.setVisible(true);
				}
			};zaman5.schedule(görevödül, 2900, 1);
		break;
		case "C) Hega":
			sesCalintro(secim);
			REnkler();
			btnNewButton_2.setVisible(false);
			btnbasla.setVisible(false);
			btnamuzo.setVisible(false);
			btnGrc.setVisible(false);
			btnDen.setVisible(false);
			zamanlayýcýqq.cancel();
			Timer zamanlayýcý6=new Timer();
			
			TimerTask görev8=new  TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
						btnCHega.setBackground(Color.ORANGE);
						sayac++;
						
						
					
				}
			};
			zamanlayýcý6.schedule(görev8, 0, 100000);
			TimerTask görev9 =new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					clip.stop();
					sesCalintro(yanlis);
					btnCHega.setBackground(Color.RED);
					
					JOptionPane.showMessageDialog(null, "Ödülünüz 0 TL", "Durum", JOptionPane.PLAIN_MESSAGE);
					btn0tl.setBackground(Color.GREEN);
					
					
				}
			}; zamanlayýcý6.schedule(görev9, 5000, 10000);
			
			btnCHega.setBackground(Color.RED);
			
			break;
		case "D) \u015Een":
			
			sesCalintro(secim);
			REnkler();
			btnNewButton_2.setVisible(false);
			btnbasla.setVisible(false);
			btnamuzo.setVisible(false);
			btnGrc.setVisible(false);
			btnCHega.setVisible(false);
			zamanlayýcýqq.cancel();
			Timer zaman1=new Timer();
			
			TimerTask görevoo=new  TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
						btnDen.setBackground(Color.ORANGE);
						sayac++;
						
						
					
				}
			};
			zaman1.schedule(görevoo, 0, 100000);
			TimerTask görevyy= new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					clip.stop();
					sesCalintro(yanlis);
					btnDen.setBackground(Color.RED);
					JOptionPane.showMessageDialog(null, "Ödülünüz 0 TL", "Durum", JOptionPane.PLAIN_MESSAGE);
					btn0tl.setBackground(Color.GREEN);
					
					
					
				}
			}; zaman1.schedule(görevyy, 5000, 10000);
			
			btnDen.setBackground(Color.RED);
			
			break;
		case "Sýradaki soru":
			clip.stop();
			sesCalintro(gecis);
			Soru2 soru2=new Soru2();
			soru2.setVisible(true);
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
	}; zamanlayýcýx.schedule(görevy, 150, 250);
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
	
	
	
	
	TimerTask görev1=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			btnNewButton.setBackground(Color.GREEN);
		}
	};zamanlayýcýqq.schedule(görev1, 1000, 10000);
	
	
	TimerTask görev2=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			btnNewButton_1.setBackground(Color.GREEN);
							}
	};zamanlayýcýqq.schedule(görev2, 2000, 10000);
	
	
	
	TimerTask görev3=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			button.setBackground(Color.GREEN);
		}
	};zamanlayýcýqq.schedule(görev3, 3000, 10000);
	
	
	TimerTask görev4=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			button_1.setBackground(Color.YELLOW);
		}
	};zamanlayýcýqq.schedule(görev4, 4000, 10000);
TimerTask görev4a=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			button_2.setBackground(Color.YELLOW);
		}
	};zamanlayýcýqq.schedule(görev4a, 5000, 10000);
	
	TimerTask görev5=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			button_3.setBackground(Color.YELLOW);
		}
	};zamanlayýcýqq.schedule(görev5, 6000, 10000);
TimerTask görev6=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			button_4.setBackground(Color.ORANGE);
		}
	};zamanlayýcýqq.schedule(görev6, 7000, 10000);
TimerTask görev7=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			button_5.setBackground(Color.ORANGE);
		}
	};zamanlayýcýqq.schedule(görev7, 8000, 10000);
TimerTask görev8=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			button_6.setBackground(Color.ORANGE);
		}
	};zamanlayýcýqq.schedule(görev8, 9000, 10000);
TimerTask görev9=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			button_7.setBackground(Color.RED);
		}
	};zamanlayýcýqq.schedule(görev9, 10000, 10000);
    TimerTask görev10=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			button_8.setBackground(Color.RED);
		}
	};zamanlayýcýqq.schedule(görev10, 11000, 10000);
	
    TimerTask görev11=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			button_9.setBackground(Color.RED);
		}
	};zamanlayýcýqq.schedule(görev11, 12000, 10000);

    TimerTask görev12=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			button_10.setBackground(Color.RED);
		}
	};zamanlayýcýqq.schedule(görev12, 13000, 10000);

TimerTask görev13=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			button_12.setBackground(Color.RED);
		}
	};zamanlayýcýqq.schedule(görev13, 14000, 10000);
TimerTask görev14=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			button_13.setBackground(Color.RED);
		}
	};zamanlayýcýqq.schedule(görev14, 15000, 10000);


TimerTask görev15=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			button_14.setBackground(Color.RED);
		}
	};zamanlayýcýqq.schedule(görev15, 16000, 10000);
TimerTask görev16=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			button_15.setBackground(Color.RED);
			btnamuzo.setVisible(false);
			btnGrc.setVisible(false);
			btnCHega.setVisible(false);
			btnDen.setVisible(false);
			btnbasla.setVisible(false);
			btnNewButton_2.setVisible(false);
			
			JOptionPane.showMessageDialog(null, "Ödülünüz 0 TL. Doðru þýk : B ", "Durum", JOptionPane.PLAIN_MESSAGE);
			btn0tl.setBackground(Color.GREEN);
		}
	};zamanlayýcýqq.schedule(görev16, 17000, 10000);
	
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

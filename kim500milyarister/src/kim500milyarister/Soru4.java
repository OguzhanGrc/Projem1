package kim500milyarister;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Soru4 extends JFrame implements ActionListener{

	private JPanel contentPane;
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
	int sayi=0;
	private JButton btnmilyon;
	private JButton btn250;
	private JButton btn125;
	private JButton btn60;
	private JButton btnotuz;
	private JButton btn15000;
	private JButton btn7500;
	private JButton btn5000;
	private JButton btn3000;
	private JButton btn2000;
	private JButton btn1000;
	private JButton btn500;
	private JButton btn0tl;
	private JButton btna;
	private JButton btnb;
	private JButton btnc;
	private JButton btnd;
	private JButton btns�radaki;
	private JButton btnbasla;
	Timer zamanlay�c�qq=new Timer();
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_2;
	private JButton btncekil;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Soru4 frame = new Soru4();
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
	public Soru4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 691);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		 
		 btnNewButton_2 = new JButton("%50 JOKER");
		 btnNewButton_2.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		btnb.setVisible(false);
		 		btnd.setVisible(false);
		 	}
		 });
		 
		 btncekil = new JButton("\u00C7ekil");
		 btncekil.setBackground(Color.GRAY);
		 btncekil.setForeground(Color.BLUE);
		 btncekil.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		 btncekil.setVisible(false);
		 btncekil.addActionListener(new ActionListener() {
		
			 public void actionPerformed(ActionEvent e) {
		 		zamanlay�c�qq.cancel();
		 		btnbasla.setVisible(false);
		 		btna.setVisible(false);
		 		btnb.setVisible(false);
		 		btnc.setVisible(false);
		 		btnd.setVisible(false);
                 btn0tl.setBackground(Color.GREEN);
				
				btn500.setBackground(Color.GREEN);
				btn1000.setBackground(Color.GREEN);
				btn2000.setBackground(Color.GREEN);
		 		JOptionPane.showMessageDialog(null, "TEBR�KLER!!! 2000 TL KAZANDINIZ DO�RU CEVAP: A", "Durum", JOptionPane.PLAIN_MESSAGE);
		 		Timer zamanlay�c�2=new Timer();
				
				TimerTask g�rev3=new  TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
					
							btna.setBackground(Color.ORANGE);
							
							
							
						
					}
				};
				zamanlay�c�2.schedule(g�rev3, 0, 100000);
				Timer zamanlay�c�3=new Timer();
				TimerTask g�rev4= new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						//btn500.setBackground(Color.GREEN);
					
						
						btna.setBackground(Color.GREEN);
						
						
						
						
						
					}
				}; zamanlay�c�3.schedule(g�rev4, 1200,250);
				
				
				Timer zamanlay�c�4=new Timer();
				TimerTask g�rev5=new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						btna.setBackground(Color.BLACK);

	                           sayi++;
						if(sayi==8){
							zamanlay�c�4.cancel();
						}
					}
				}; zamanlay�c�4.schedule(g�rev5,1400,250);
		 		
				
		 	}
		 });
		 btncekil.setBounds(44, 574, 138, 47);
		 contentPane.add(btncekil);
		 btnNewButton_2.setBackground(Color.ORANGE);
		 btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		 btnNewButton_2.setBounds(383, 72, 115, 58);
		 contentPane.add(btnNewButton_2);
		 
		 JPanel panel = new JPanel();
		 panel.setBackground(Color.BLACK);
		 panel.setBounds(93, 319, 485, 80);
		 contentPane.add(panel);
		 
		 JLabel lblNewLabel = new JLabel("Avrupa Birli\u011Fi \u00DClkelerinden hangisinin n\u00FCfusu daha fazlad\u0131r?");
		 lblNewLabel.setVisible(false);
		 panel.add(lblNewLabel);
		 lblNewLabel.setForeground(Color.RED);
		 lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		 button = new JButton("");
		button.setBounds(142, 285, 15, 23);
		contentPane.add(button);
		
		 button_1 = new JButton("");
		button_1.setBounds(167, 285, 15, 23);
		contentPane.add(button_1);
		
		 button_2 = new JButton("");
		button_2.setBounds(192, 285, 15, 23);
		contentPane.add(button_2);
		
		 button_3 = new JButton("");
		button_3.setBounds(225, 285, 15, 23);
		contentPane.add(button_3);
		
		 button_4 = new JButton("");
		button_4.setBackground(SystemColor.inactiveCaption);
		button_4.setBounds(258, 285, 15, 23);
		contentPane.add(button_4);
		
		 button_5 = new JButton("");
		button_5.setBounds(283, 285, 15, 23);
		contentPane.add(button_5);
		
		 button_6 = new JButton("");
		button_6.setBounds(308, 285, 15, 23);
		contentPane.add(button_6);
		
		 button_7 = new JButton("");
		button_7.setBounds(333, 285, 15, 23);
		contentPane.add(button_7);
		
		 button_8 = new JButton("");
		button_8.setBounds(358, 285, 15, 23);
		contentPane.add(button_8);
		
		 button_9 = new JButton("");
		button_9.setBounds(383, 285, 15, 23);
		contentPane.add(button_9);
		
		 button_10 = new JButton("");
		button_10.setBounds(408, 285, 15, 23);
		contentPane.add(button_10);
		
		 button_11 = new JButton("");
		button_11.setBounds(433, 285, 15, 23);
		contentPane.add(button_11);
		
		 button_12 = new JButton("");
		button_12.setBounds(458, 285, 15, 23);
		contentPane.add(button_12);
		
		 button_13 = new JButton("");
		button_13.setBounds(483, 285, 15, 23);
		contentPane.add(button_13);
		
		 button_14 = new JButton("");
		button_14.setBounds(514, 285, 15, 23);
		contentPane.add(button_14);
		
		button_15 = new JButton("");
		button_15.setBounds(539, 285, 15, 23);
		contentPane.add(button_15);
		
		 btnNewButton = new JButton("");
		btnNewButton.setBounds(93, 285, 15, 23);
		contentPane.add(btnNewButton);
		
		 btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(118, 285, 15, 23);
		contentPane.add(btnNewButton_1);
		
		btnmilyon = new JButton("1000000 TL");
		btnmilyon.setForeground(Color.MAGENTA);
		btnmilyon.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnmilyon.setBackground(Color.BLACK);
		btnmilyon.setBounds(595, 0, 119, 36);
		contentPane.add(btnmilyon);
		
		btn250 = new JButton("250000TL");
		btn250.setForeground(Color.MAGENTA);
		btn250.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn250.setBackground(Color.BLACK);
		btn250.setBounds(605, 47, 105, 36);
		contentPane.add(btn250);
		
		btn125 = new JButton("125000 TL");
		btn125.setForeground(Color.MAGENTA);
		btn125.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn125.setBackground(Color.BLACK);
		btn125.setBounds(609, 94, 105, 36);
		contentPane.add(btn125);
		
		btn60 = new JButton("60000 TL");
		btn60.setForeground(Color.MAGENTA);
		btn60.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn60.setBackground(Color.BLACK);
		btn60.setBounds(609, 141, 105, 36);
		contentPane.add(btn60);
		
		btnotuz = new JButton("30000 TL");
		btnotuz.setForeground(Color.MAGENTA);
		btnotuz.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnotuz.setBackground(Color.BLACK);
		btnotuz.setBounds(609, 187, 105, 36);
		contentPane.add(btnotuz);
		
		btn15000 = new JButton("15000 TL");
		btn15000.setForeground(Color.MAGENTA);
		btn15000.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn15000.setBackground(Color.BLACK);
		btn15000.setBounds(609, 243, 105, 36);
		contentPane.add(btn15000);
		
		btn7500 = new JButton("7500 TL");
		btn7500.setForeground(Color.MAGENTA);
		btn7500.setBackground(Color.BLACK);
		btn7500.setBounds(609, 290, 105, 46);
		contentPane.add(btn7500);
		
		btn5000 = new JButton("5000 TL");
		btn5000.setForeground(Color.MAGENTA);
		btn5000.setBackground(Color.BLACK);
		btn5000.setBounds(609, 347, 105, 36);
		contentPane.add(btn5000);
		
		btn3000 = new JButton("3000 TL");
		btn3000.setForeground(Color.MAGENTA);
		btn3000.setBackground(Color.BLACK);
		btn3000.setBounds(609, 398, 105, 36);
		contentPane.add(btn3000);
		
		btn2000 = new JButton("2000 TL");
		btn2000.setForeground(Color.MAGENTA);
		btn2000.setBackground(Color.BLACK);
		btn2000.setBounds(609, 445, 105, 36);
		contentPane.add(btn2000);
		
		btn1000 = new JButton("1000 TL");
		btn1000.setForeground(Color.MAGENTA);
		btn1000.setBackground(Color.BLACK);
		btn1000.setBounds(614, 504, 96, 33);
		contentPane.add(btn1000);
		
		btn500 = new JButton(" 500 TL");
		btn500.setForeground(Color.MAGENTA);
		btn500.setBackground(Color.BLACK);
		btn500.setBounds(628, 559, 86, 23);
		contentPane.add(btn500);
		
		btn0tl = new JButton(" 0 TL");
		btn0tl.setForeground(Color.MAGENTA);
		btn0tl.setBackground(Color.BLACK);
		btn0tl.setBounds(647, 598, 67, 23);
		contentPane.add(btn0tl);
		
		btna = new JButton("A) Almanya");
		btna.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btna.setBounds(130, 440, 143, 46);
		btna.addActionListener(this);
		btna.setVisible(false);
		contentPane.add(btna);
		
		btnb = new JButton("B) Fransa");
		btnb.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnb.setBounds(339, 440, 134, 46);
		btnb.addActionListener(this);
		btnb.setVisible(false);
		contentPane.add(btnb);
		
		btnc = new JButton("C) Yunanistan");
		btnc.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnc.setBounds(130, 504, 143, 46);
		btnc.addActionListener(this);
		btnc.setVisible(false);
		contentPane.add(btnc);
		
		btnd = new JButton("D) \u0130talya");
		btnd.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnd.setBounds(339, 504, 134, 46);
		btnd.addActionListener(this);
		btnd.setVisible(false);
		contentPane.add(btnd);
		
	 btns�radaki = new JButton("S\u0131radaki soru");
	 btns�radaki.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
	 btns�radaki.setBackground(Color.CYAN);
	 btns�radaki.setForeground(Color.BLUE);
	btns�radaki.setVisible(false);	
	 btns�radaki.setBounds(397, 598, 115, 43);
		btns�radaki.addActionListener(this);
		contentPane.add(btns�radaki);
		
		btnbasla = new JButton("Ba\u015Fla");
		btnbasla.setIcon(new ImageIcon("C:\\OGURCU\\resimler\\b4e2aa02_Start-Button.png"));
		btnbasla.setBackground(new Color(220, 20, 60));
		btnbasla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btncekil.setVisible(true);
				btna.setVisible(true);
				btnb.setVisible(true);
				btnc.setVisible(true);
				btnd.setVisible(true);
				lblNewLabel.setVisible(true);
				s�re();
				
				
				
				
				
			}
		});
		btnbasla.setBounds(29, 175, 211, 64);
		contentPane.add(btnbasla);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\OGURCU\\resimler\\1_d.jpg"));
		lblNewLabel_1.setBounds(-165, -57, 879, 824);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("K\u0130M 1000000 \u0130STER");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(210, 11, 485, 36);
		contentPane.add(lblNewLabel_2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton bas�lanbuton=(JButton) e.getSource();
		String butonismi= bas�lanbuton.getText();
		
		switch (butonismi) {
		case "A) Almanya":
			btnbasla.setVisible(false);
			btnb.setVisible(false);
			btnc.setVisible(false);
			btnd.setVisible(false);
			btncekil.setVisible(false);
			btnNewButton_2.setVisible(false);
			
			zamanlay�c�qq.cancel();
			REnkler();
			
Timer zamanlay�c�2=new Timer();
			
			TimerTask g�rev3=new  TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
				
						btna.setBackground(Color.ORANGE);
						
						
						
					
				}
			};
			zamanlay�c�2.schedule(g�rev3, 0, 100000);
			Timer zamanlay�c�3=new Timer();
			TimerTask g�rev4= new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					//btn500.setBackground(Color.GREEN);
				
					
					btna.setBackground(Color.GREEN);
					
					
					
					
					
				}
			}; zamanlay�c�3.schedule(g�rev4, 1200,250);
			
			
			Timer zamanlay�c�4=new Timer();
			TimerTask g�rev5=new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					btna.setBackground(Color.BLACK);

                           sayi++;
					if(sayi==8){
						zamanlay�c�4.cancel();
					}
				}
			}; zamanlay�c�4.schedule(g�rev5,1400,250);
			Timer zaman5=new Timer();
			TimerTask g�rev�d�l=new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					btn0tl.setBackground(Color.GREEN);
				
					btn500.setBackground(Color.GREEN);
					btn1000.setBackground(Color.GREEN);
					btn2000.setBackground(Color.GREEN);
					btn3000.setBackground(Color.GREEN);
					btns�radaki.setVisible(true);
				}
			};zaman5.schedule(g�rev�d�l, 1200, 1);
			
			
			
			break;
			
         case "B) Fransa":
        	 btnbasla.setVisible(false);
        	 btna.setVisible(false);
        	 btnd.setVisible(false);
        	 btnc.setVisible(false);
        	 btnNewButton_2.setVisible(false);
        	 btncekil.setVisible(false);
        	 zamanlay�c�qq.cancel();
 			REnkler();
			
        	 Timer zamanlay�c�6=new Timer();
 			
 			TimerTask g�rev8=new  TimerTask() {
 				
 				@Override
 				public void run() {
 					// TODO Auto-generated method stub
 					
 						btnb.setBackground(Color.ORANGE);
 						
 						
 						
 					
 				}
 			};
 			zamanlay�c�6.schedule(g�rev8, 0, 100000);
 			TimerTask g�rev9 =new TimerTask() {
 				
 				@Override
 				public void run() {
 					// TODO Auto-generated method stub
 					
 					btnb.setBackground(Color.RED);
 					
 					
 					JOptionPane.showMessageDialog(null, "Baraj� ge�ti�iniz i�in �d�l�n�z 1000 TL. Do�ru ��k : A ", "Durum", JOptionPane.PLAIN_MESSAGE);
 					btn1000.setBackground(Color.GREEN);
 					
 				}
 			}; zamanlay�c�6.schedule(g�rev9, 5000, 10000);
 			
 			btnb.setBackground(Color.RED);
 			
        	 
        	 
        	 
        	 break;
			
        case "C) Yunanistan":
        	btnbasla.setVisible(false);
        btna.setVisible(false);
        btnb.setVisible(false);
        btnd.setVisible(false);
        btncekil.setVisible(false);
        btnNewButton_2.setVisible(false);
        	
        	zamanlay�c�qq.cancel();
			REnkler();
    Timer zamanlay�c�333=new Timer();
			
			TimerTask g�revax=new  TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
						btnc.setBackground(Color.ORANGE);
						
						
						
					
				}
			};
			zamanlay�c�333.schedule(g�revax, 0, 100000);
			TimerTask g�rev91 =new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					btnc.setBackground(Color.RED);
					
					JOptionPane.showMessageDialog(null, "Baraj� ge�ti�iniz i�in �d�l�n�z 1000 TL. Do�ru ��k : A ", "Durum", JOptionPane.PLAIN_MESSAGE);
					btn1000.setBackground(Color.GREEN);
					
					
				}
			}; zamanlay�c�333.schedule(g�rev91, 5000, 10000);
			
			btnc.setBackground(Color.RED);
			
        	
        	
        	
        	
	break;
      case "D) �talya":
    	  btnbasla.setVisible(false); 
    	  zamanlay�c�qq.cancel();
			REnkler();
	
    	  Timer zamanlay�c�678=new Timer();
			
			TimerTask g�rev89=new  TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
						btnd.setBackground(Color.ORANGE);
						
						
						
					
				}
			};
			zamanlay�c�678.schedule(g�rev89, 0, 100000);
			TimerTask g�rev98 =new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					btnd.setBackground(Color.RED);
					
					JOptionPane.showMessageDialog(null, "Baraj� ge�ti�iniz i�in �d�l�n�z 1000 TL. Do�ru ��k : A ", "Durum", JOptionPane.PLAIN_MESSAGE);
					
					btn1000.setBackground(Color.GREEN);
					
				}
			}; zamanlay�c�678.schedule(g�rev98, 5000, 10000);
			
			btnd.setBackground(Color.RED);
			
    	  
    	  
    	  
    	  
    	  
    	  
	      break;
		
      case "S�radaki soru":
			
    	  
    	  Soru5 soru5=new Soru5();
    	  soru5.setVisible(true);
    	  
    	  
    	  
			break;
      
      
      
      default:
			break;
		}
	
	}


	public  void REnkler(){
		
		
		Timer zamanlay�c�x=new Timer();
	TimerTask g�rev0=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn0tl.setBackground(Color.ORANGE);
				
				
			}
		};zamanlay�c�x.schedule(g�rev0, 90, 10000);
		TimerTask g�revx=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn500.setBackground(Color.ORANGE);
				
				
			}
		};zamanlay�c�x.schedule(g�revx, 120, 100000);
		
		TimerTask g�revy=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn1000.setBackground(Color.ORANGE);
			}
		}; zamanlay�c�x.schedule(g�revy, 150, 10000);
		TimerTask g�revz=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn2000.setBackground(Color.ORANGE);
			}
		};zamanlay�c�x.schedule(g�revz, 180, 10000);
		TimerTask g�reva=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn3000.setBackground(Color.ORANGE);
			}
		};zamanlay�c�x.schedule(g�reva, 210, 10000);
	      TimerTask g�revb=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn5000.setBackground(Color.ORANGE);
			}
		};zamanlay�c�x.schedule(g�revb, 240, 250);
		
	TimerTask g�revc=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn7500.setBackground(Color.ORANGE);
			}
		};zamanlay�c�x.schedule(g�revc, 270, 250);
		
	TimerTask g�revd=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn15000.setBackground(Color.ORANGE);
			}
		};zamanlay�c�x.schedule(g�revd, 300, 250);
		
	TimerTask g�reve=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btnotuz.setBackground(Color.ORANGE);
			}
		};zamanlay�c�x.schedule(g�reve, 330, 250);
	TimerTask g�revf=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn60.setBackground(Color.ORANGE);
			}
		};zamanlay�c�x.schedule(g�revf, 360, 250);
	TimerTask g�revg=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn125.setBackground(Color.ORANGE);
			}
		};zamanlay�c�x.schedule(g�revg, 390, 250);
	TimerTask g�revh=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btn250.setBackground(Color.ORANGE);
			}
		};zamanlay�c�x.schedule(g�revh,420, 250);
	TimerTask g�revj=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btnmilyon.setBackground(Color.ORANGE);
			}
		};zamanlay�c�x.schedule(g�revj, 450, 250);
	}
	public void s�re(){
		
		TimerTask g�rev1=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btnNewButton.setBackground(Color.GREEN);
			}
		};zamanlay�c�qq.schedule(g�rev1, 2000, 1);
		
		
		TimerTask g�rev2=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btnNewButton_1.setBackground(Color.GREEN);
								}
		};zamanlay�c�qq.schedule(g�rev2, 4000, 1);
		
		
		
		TimerTask g�rev3=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button.setBackground(Color.GREEN);
			}
		};zamanlay�c�qq.schedule(g�rev3, 6000, 1);
		
		
		TimerTask g�rev4=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_1.setBackground(Color.YELLOW);
			}
		};zamanlay�c�qq.schedule(g�rev4, 8000, 1);
	TimerTask g�rev4a=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_2.setBackground(Color.YELLOW);
			}
		};zamanlay�c�qq.schedule(g�rev4a, 10000, 1);
		
		TimerTask g�rev5=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_3.setBackground(Color.YELLOW);
			}
		};zamanlay�c�qq.schedule(g�rev5, 12000, 1);
	TimerTask g�rev6=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_4.setBackground(Color.ORANGE);
			}
		};zamanlay�c�qq.schedule(g�rev6, 14000, 1);
	TimerTask g�rev7=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_5.setBackground(Color.ORANGE);
			}
		};zamanlay�c�qq.schedule(g�rev7, 16000, 1);
	TimerTask g�rev8=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_6.setBackground(Color.ORANGE);
			}
		};zamanlay�c�qq.schedule(g�rev8, 18000, 1);
	TimerTask g�rev9=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_7.setBackground(Color.RED);
			}
		};zamanlay�c�qq.schedule(g�rev9, 20000, 1);
	    TimerTask g�rev10=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_8.setBackground(Color.RED);
			}
		};zamanlay�c�qq.schedule(g�rev10, 22000, 1);
		
	    TimerTask g�rev11=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_9.setBackground(Color.RED);
			}
		};zamanlay�c�qq.schedule(g�rev11, 24000, 1);

	    TimerTask g�rev12=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_10.setBackground(Color.RED);
			}
		};zamanlay�c�qq.schedule(g�rev12, 26000, 1);

TimerTask g�rev12b=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_11.setBackground(Color.RED);
			}
		};zamanlay�c�qq.schedule(g�rev12b, 28000, 1);
	TimerTask g�rev13=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_12.setBackground(Color.RED);
			}
		};zamanlay�c�qq.schedule(g�rev13, 30000, 1);
	TimerTask g�rev14=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_13.setBackground(Color.RED);
			}
		};zamanlay�c�qq.schedule(g�rev14, 32000, 1);


	TimerTask g�rev15=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_14.setBackground(Color.RED);
			}
		};zamanlay�c�qq.schedule(g�rev15, 34000, 1);
	TimerTask g�rev16=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_15.setBackground(Color.RED);
				btna.setVisible(false);
				btnb.setVisible(false);
				btnc.setVisible(false);
				btnd.setVisible(false);
				btnNewButton_2.setVisible(false);
				btncekil.setVisible(false);
				btnbasla.setVisible(false);
				
				JOptionPane.showMessageDialog(null, "Baraj� ge�ti�iniz i�in �d�l�n�z 1000 TL. Do�ru ��k : A ", "Durum", JOptionPane.PLAIN_MESSAGE);
				btn1000.setBackground(Color.GREEN);
			}
		};zamanlay�c�qq.schedule(g�rev16, 36000, 10000);}
}

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
import java.rmi.activation.ActivationInstantiator;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Soru5 extends JFrame implements ActionListener {

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
	private JButton btn0tl;
	private JButton btn500;
	private JButton btn1000;
	private JButton btn2000;
	private JButton btn3000;
	private JButton btn5000;
	private JButton btn7500;
	private JButton btn15000;
	private JButton btnotuz;
	private JButton btn60;
	private JButton btn125;
	private JButton btn250;
	private JButton btnmilyon;
	int sayi=0;
	
	Timer zamanlayýcýqq=new Timer();
	private JLabel lblNewLabel;
	private JButton btna;
	private JButton btnb;
	private JButton btnc;
	private JButton btnd;
	private JButton btnsýradaki;
	private JButton btnbasla;
	private JPanel panel;
	private JLabel lblNewLabel_1;
	private JButton btncekil;
	
	private JButton btnyuzde ;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Soru5 frame = new Soru5();
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
	public Soru5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 739, 690);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	    
	    btncekil = new JButton("\u00C7ekil");
	  btncekil.setVisible(false);
	    btncekil.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		btnbasla.setVisible(false);
	    		zamanlayýcýqq.cancel();
	    		btna.setVisible(false);
	    		btnb.setVisible(false);
	    		btnc.setVisible(false);
	    		btnd.setVisible(false);
	    		btn0tl.setBackground(Color.GREEN);
 				
					btn500.setBackground(Color.GREEN);
					btn1000.setBackground(Color.GREEN);
					btn2000.setBackground(Color.GREEN);
					btn3000.setBackground(Color.GREEN);
					JOptionPane.showMessageDialog(null, "TEBRÝKLER!!! 3000 TL KAZANDINIZ. DOÐRU CEVAP: B", "Durum", JOptionPane.PLAIN_MESSAGE);
					 
		        	 Timer zamanlayýcý2=new Timer();
		 			
		 			TimerTask görev3=new  TimerTask() {
		 				
		 				@Override
		 				public void run() {
		 					// TODO Auto-generated method stub
		 				
		 						btnb.setBackground(Color.ORANGE);
		 						
		 						
		 						
		 					
		 				}
		 			};
		 			zamanlayýcý2.schedule(görev3, 0, 100000);
		 			Timer zamanlayýcý3=new Timer();
		 			TimerTask görev4= new TimerTask() {
		 				
		 				@Override
		 				public void run() {
		 					// TODO Auto-generated method stub
		 					//btn500.setBackground(Color.GREEN);
		 				
		 					
		 					btnb.setBackground(Color.GREEN);
		 					
		 					
		 					
		 					
		 					
		 				}
		 			}; zamanlayýcý3.schedule(görev4, 1200,250);
		 			
		 			
		 			Timer zamanlayýcý4=new Timer();
		 			TimerTask görev5=new TimerTask() {
		 				
		 				@Override
		 				public void run() {
		 					// TODO Auto-generated method stub
		 					btnb.setBackground(Color.BLACK);

		                            sayi++;
		 					if(sayi==8){
		 						zamanlayýcý4.cancel();
		 					}
		 				}
		 			}; zamanlayýcý4.schedule(görev5,1400,250);
	    		
	    	}
	    });
	    
	     btnyuzde = new JButton("%50 Joker");
	    btnyuzde.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    		btna.setVisible(false);
	    		btnd.setVisible(false);
	    	
	    	}
	    });
	    btnyuzde.setBackground(Color.YELLOW);
	    btnyuzde.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
	    btnyuzde.setBounds(442, 103, 124, 57);
	    contentPane.add(btnyuzde);
	    btncekil.setForeground(Color.BLUE);
	    btncekil.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
	    btncekil.setBackground(Color.GRAY);
	    btncekil.setBounds(60, 574, 127, 46);
	    contentPane.add(btncekil);
		
	    button = new JButton("");
		button.setBounds(151, 276, 15, 23);
		contentPane.add(button);
		
		button_1 = new JButton("");
		button_1.setBounds(176, 276, 15, 23);
		contentPane.add(button_1);
		
	    button_2 = new JButton("");
		button_2.setBounds(200, 276, 15, 23);
		contentPane.add(button_2);
		
		 button_3 = new JButton("");
		button_3.setBounds(225, 276, 15, 23);
		contentPane.add(button_3);
		
		 button_4 = new JButton("");
		button_4.setBounds(250, 276, 15, 23);
		contentPane.add(button_4);
		
		 button_5 = new JButton("");
		button_5.setBounds(283, 276, 15, 23);
		contentPane.add(button_5);
		
		 button_6 = new JButton("");
		button_6.setBackground(SystemColor.inactiveCaption);
		button_6.setBounds(316, 276, 15, 23);
		contentPane.add(button_6);
		
		 button_7 = new JButton("");
		button_7.setBounds(341, 276, 15, 23);
		contentPane.add(button_7);
		
		 button_8 = new JButton("");
		button_8.setBounds(366, 276, 15, 23);
		contentPane.add(button_8);
		
		 button_9 = new JButton("");
		button_9.setBounds(391, 276, 15, 23);
		contentPane.add(button_9);
		
		 button_10 = new JButton("");
		button_10.setBounds(416, 276, 15, 23);
		contentPane.add(button_10);
		
		 button_11 = new JButton("");
		button_11.setBounds(441, 276, 15, 23);
		contentPane.add(button_11);
		
		 button_12 = new JButton("");
		button_12.setBounds(466, 276, 15, 23);
		contentPane.add(button_12);
		
		 button_13 = new JButton("");
		button_13.setBounds(491, 276, 15, 23);
		contentPane.add(button_13);
		
		 button_14 = new JButton("");
		button_14.setBounds(516, 276, 15, 23);
		contentPane.add(button_14);
		
		 button_15 = new JButton("");
		button_15.setBounds(541, 276, 15, 23);
		contentPane.add(button_15);
		
		 btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(126, 276, 15, 23);
		contentPane.add(btnNewButton_1);
		
		 btnNewButton = new JButton("");
		btnNewButton.setBounds(101, 276, 15, 23);
		contentPane.add(btnNewButton);
		
		btn0tl = new JButton(" 0 TL");
		btn0tl.setForeground(Color.MAGENTA);
		btn0tl.setBackground(Color.BLACK);
		btn0tl.setBounds(634, 598, 67, 23);
		contentPane.add(btn0tl);
		
		btn500 = new JButton(" 500 TL");
		btn500.setForeground(Color.MAGENTA);
		btn500.setBackground(Color.BLACK);
		btn500.setBounds(634, 559, 67, 23);
		contentPane.add(btn500);
		
		btn1000 = new JButton("1000 TL");
		btn1000.setForeground(Color.MAGENTA);
		btn1000.setBackground(Color.BLACK);
		btn1000.setBounds(630, 504, 86, 33);
		contentPane.add(btn1000);
		
		btn2000 = new JButton("2000 TL");
		btn2000.setForeground(Color.MAGENTA);
		btn2000.setBackground(Color.BLACK);
		btn2000.setBounds(615, 445, 105, 36);
		contentPane.add(btn2000);
		
		btn3000 = new JButton("3000 TL");
		btn3000.setForeground(Color.MAGENTA);
		btn3000.setBackground(Color.BLACK);
		btn3000.setBounds(615, 398, 105, 36);
		contentPane.add(btn3000);
		
		btn5000 = new JButton("5000 TL");
		btn5000.setForeground(Color.MAGENTA);
		btn5000.setBackground(Color.BLACK);
		btn5000.setBounds(615, 347, 105, 36);
		contentPane.add(btn5000);
		
		btn7500 = new JButton("7500 TL");
		btn7500.setForeground(Color.MAGENTA);
		btn7500.setBackground(Color.BLACK);
		btn7500.setBounds(615, 290, 105, 46);
		contentPane.add(btn7500);
		
		btn15000 = new JButton("15000 TL");
		btn15000.setForeground(Color.MAGENTA);
		btn15000.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn15000.setBackground(Color.BLACK);
		btn15000.setBounds(615, 243, 105, 36);
		contentPane.add(btn15000);
		
		btnotuz = new JButton("30000 TL");
		btnotuz.setForeground(Color.MAGENTA);
		btnotuz.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnotuz.setBackground(Color.BLACK);
		btnotuz.setBounds(615, 187, 105, 36);
		contentPane.add(btnotuz);
		
		btn60 = new JButton("60000 TL");
		btn60.setForeground(Color.MAGENTA);
		btn60.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn60.setBackground(Color.BLACK);
		btn60.setBounds(615, 141, 105, 36);
		contentPane.add(btn60);
		
		btn125 = new JButton("125000 TL");
		btn125.setForeground(Color.MAGENTA);
		btn125.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn125.setBackground(Color.BLACK);
		btn125.setBounds(615, 94, 105, 36);
		contentPane.add(btn125);
		
		btn250 = new JButton("250000TL");
		btn250.setForeground(Color.MAGENTA);
		btn250.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn250.setBackground(Color.BLACK);
		btn250.setBounds(611, 47, 105, 36);
		contentPane.add(btn250);
		
		btnmilyon = new JButton("1000000 TL");
		btnmilyon.setForeground(Color.MAGENTA);
		btnmilyon.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnmilyon.setBackground(Color.BLACK);
		btnmilyon.setBounds(601, 0, 119, 36);
		contentPane.add(btnmilyon);
		
		btna = new JButton("A) \u0130spanyolca");
		btna.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btna.setBounds(136, 415, 141, 66);
		btna.setVisible(false);
		btna.addActionListener(this);
		contentPane.add(btna);
		
		btnb = new JButton("B) \u00C7ince");
		btnb.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnb.setBounds(366, 415, 124, 66);
		btnb.setVisible(false);
		btnb.addActionListener(this);
		contentPane.add(btnb);
		
		btnc = new JButton("C) \u0130ngilizce");
		btnc.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnc.setBounds(136, 497, 141, 66);
		btnc.setVisible(false);
		btnc.addActionListener(this);
		contentPane.add(btnc);
		
		btnd = new JButton("D) Hint\u00E7e");
		btnd.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnd.setBounds(366, 497, 124, 66);
		btnd.setVisible(false);
		btnd.addActionListener(this);
		contentPane.add(btnd);
		
		btnsýradaki = new JButton("S\u0131radaki soru");
		btnsýradaki.setBackground(Color.CYAN);
		btnsýradaki.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnsýradaki.setBounds(416, 575, 138, 46);
		btnsýradaki.addActionListener(this);
		btnsýradaki.setVisible(false);
		contentPane.add(btnsýradaki);
		
		btnbasla = new JButton("Ba\u015Fla");
		btnbasla.setIcon(new ImageIcon("C:\\OGURCU\\resimler\\b4e2aa02_Start-Button.png"));
		btnbasla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btna.setVisible(true);
				btnb.setVisible(true);
				btnc.setVisible(true);
				btnd.setVisible(true);
				lblNewLabel.setVisible(true);
				btncekil.setVisible(true);
				süre();
				
			}
		});
		btnbasla.setBounds(10, 133, 205, 57);
		contentPane.add(btnbasla);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(88, 310, 478, 83);
		contentPane.add(panel);
		
		lblNewLabel = new JLabel(" Hangisi d\u00FCnyan\u0131n en \u00E7ok konu\u015Fulan dilidir?");
		lblNewLabel.setBounds(80, 29, 322, 19);
		lblNewLabel.setVisible(false);
		panel.setLayout(null);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\OGURCU\\resimler\\1_d.jpg"));
		lblNewLabel_1.setBounds(-183, -51, 920, 797);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Kim 1.000.000 TL \u0130STER");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(204, 0, 601, 57);
		contentPane.add(lblNewLabel_2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton basýlanbuton=(JButton) e.getSource();
		String butonismi=basýlanbuton.getText();
		
		switch (butonismi) {
		case "A) Ýspanyolca":
			btnbasla.setVisible(false);
			btnb.setVisible(false);
			btnc.setVisible(false);
			btnd.setVisible(false);
			btncekil.setVisible(false);
			btnyuzde.setVisible(false);
			
			zamanlayýcýqq.cancel();
			REnkler();
			 Timer zamanlayýcý678=new Timer();
				
				TimerTask görev89=new  TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						
							btna.setBackground(Color.ORANGE);
							
							
							
						
					}
				};
				zamanlayýcý678.schedule(görev89, 0, 100000);
				TimerTask görev98 =new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						
						btna.setBackground(Color.RED);
						JOptionPane.showMessageDialog(null, "Barajý geçtiðiniz için Ödülünüz 1000 TL. Doðru þýk : B ", "Durum", JOptionPane.PLAIN_MESSAGE);
						btn1000.setBackground(Color.GREEN);
						
						
						
					}
				}; zamanlayýcý678.schedule(görev98, 5000, 10000);
				
				btna.setBackground(Color.RED);
			
			
			
			
			break;
         case "B) Çince" :
        	 btnbasla.setVisible(false);
        	 btna.setVisible(false);
 			btnc.setVisible(false);
 			btnd.setVisible(false);
 			btncekil.setVisible(false);
 			btnyuzde.setVisible(false);
        	 zamanlayýcýqq.cancel();
 			REnkler();
        	 
        	 Timer zamanlayýcý2=new Timer();
 			
 			TimerTask görev3=new  TimerTask() {
 				
 				@Override
 				public void run() {
 					// TODO Auto-generated method stub
 				
 						btnb.setBackground(Color.ORANGE);
 						
 						
 						
 					
 				}
 			};
 			zamanlayýcý2.schedule(görev3, 0, 100000);
 			Timer zamanlayýcý3=new Timer();
 			TimerTask görev4= new TimerTask() {
 				
 				@Override
 				public void run() {
 					// TODO Auto-generated method stub
 					//btn500.setBackground(Color.GREEN);
 				
 					
 					btnb.setBackground(Color.GREEN);
 					
 					
 					
 					
 					
 				}
 			}; zamanlayýcý3.schedule(görev4, 1200,250);
 			
 			
 			Timer zamanlayýcý4=new Timer();
 			TimerTask görev5=new TimerTask() {
 				
 				@Override
 				public void run() {
 					// TODO Auto-generated method stub
 					btnb.setBackground(Color.BLACK);

                            sayi++;
 					if(sayi==8){
 						zamanlayýcý4.cancel();
 					}
 				}
 			}; zamanlayýcý4.schedule(görev5,1400,250);
 			Timer zaman5=new Timer();
 			TimerTask görevödül=new TimerTask() {
 				
 				@Override
 				public void run() {
 					// TODO Auto-generated method stub
 					btn0tl.setBackground(Color.GREEN);
 				
 					btn500.setBackground(Color.GREEN);
 					btn1000.setBackground(Color.GREEN);
 					btn2000.setBackground(Color.GREEN);
 					btn3000.setBackground(Color.GREEN);
 					btn5000.setBackground(Color.GREEN);
 					btnsýradaki.setVisible(true);
 				}
 			};zaman5.schedule(görevödül, 1200, 1);
        	 
        	 
        	 
        	 
        	 
        	 
			break;
          case "C) Ýngilizce":
        	  btnbasla.setVisible(false);
        	  btnb.setVisible(false);
  			btna.setVisible(false);
  			btnd.setVisible(false);
  			btncekil.setVisible(false);
  			btnyuzde.setVisible(false);
        	  zamanlayýcýqq.cancel();
  			REnkler();
        	  Timer zamanlayýcý333=new Timer();
  			
  			TimerTask görevax=new  TimerTask() {
  				
  				@Override
  				public void run() {
  					// TODO Auto-generated method stub
  					
  						btnc.setBackground(Color.ORANGE);
  						
  						
  						
  					
  				}
  			};
  			zamanlayýcý333.schedule(görevax, 0, 100000);
  			TimerTask görev91 =new TimerTask() {
  				
  				@Override
  				public void run() {
  					// TODO Auto-generated method stub
  					
  					btnc.setBackground(Color.RED);
  					
  					JOptionPane.showMessageDialog(null, "Barajý geçtiðiniz için Ödülünüz 1000 TL. Doðru þýk : B ", "Durum", JOptionPane.PLAIN_MESSAGE);
  					
  					btn1000.setBackground(Color.GREEN);
  					
  				}
  			}; zamanlayýcý333.schedule(görev91, 5000, 10000);
  			
  			btnc.setBackground(Color.RED);
  			
          	
          	
        	  
        	  
        	  
	break;
         case "D) Hintçe":
        	 btnbasla.setVisible(false);
        	 btnb.setVisible(false);
 			btnc.setVisible(false);
 			btna.setVisible(false);
 			btncekil.setVisible(false);
 			btnyuzde.setVisible(false);
        	 zamanlayýcýqq.cancel();
 			REnkler();
        	 
        	 Timer zamanlayýcý6=new Timer();
  			
  			TimerTask görev8=new  TimerTask() {
  				
  				@Override
  				public void run() {
  					// TODO Auto-generated method stub
  					
  						btnd.setBackground(Color.ORANGE);
  						
  						
  						
  					
  				}
  			};
  			zamanlayýcý6.schedule(görev8, 0, 100000);
  			TimerTask görev9 =new TimerTask() {
  				
  				@Override
  				public void run() {
  					// TODO Auto-generated method stub
  					
  					btnd.setBackground(Color.RED);
  					
  					
  					JOptionPane.showMessageDialog(null, "Barajý geçtiðiniz için Ödülünüz 1000 TL. Doðru þýk : B ", "Durum", JOptionPane.PLAIN_MESSAGE);
  					btn1000.setBackground(Color.GREEN);
  					
  				}
  			}; zamanlayýcý6.schedule(görev9, 5000, 10000);
  			
  			btnd.setBackground(Color.RED);
  			
         	 
         	 
        	 
        	 
        	 
	break;
        case "Sýradaki soru":
	
        	Soru6 soru6=new Soru6();
        	soru6.setVisible(true);
        	
        	
        	
        	
        	
	break;
		default:
			break;
		}
		
		
	}

	
	
	
public void süre(){
		
		TimerTask görev1=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btnNewButton.setBackground(Color.GREEN);
			}
		};zamanlayýcýqq.schedule(görev1, 2000, 1);
		
		
		TimerTask görev2=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				btnNewButton_1.setBackground(Color.GREEN);
								}
		};zamanlayýcýqq.schedule(görev2, 4000, 1);
		
		
		
		TimerTask görev3=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button.setBackground(Color.GREEN);
			}
		};zamanlayýcýqq.schedule(görev3, 6000, 1);
		
		
		TimerTask görev4=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_1.setBackground(Color.YELLOW);
			}
		};zamanlayýcýqq.schedule(görev4, 8000, 1);
	TimerTask görev4a=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_2.setBackground(Color.YELLOW);
			}
		};zamanlayýcýqq.schedule(görev4a, 10000, 1);
		
		TimerTask görev5=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_3.setBackground(Color.YELLOW);
			}
		};zamanlayýcýqq.schedule(görev5, 12000, 1);
	TimerTask görev6=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_4.setBackground(Color.ORANGE);
			}
		};zamanlayýcýqq.schedule(görev6, 14000, 1);
	TimerTask görev7=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_5.setBackground(Color.ORANGE);
			}
		};zamanlayýcýqq.schedule(görev7, 16000, 1);
	TimerTask görev8=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_6.setBackground(Color.ORANGE);
			}
		};zamanlayýcýqq.schedule(görev8, 18000, 1);
	TimerTask görev9=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_7.setBackground(Color.RED);
			}
		};zamanlayýcýqq.schedule(görev9, 20000, 1);
	    TimerTask görev10=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_8.setBackground(Color.RED);
			}
		};zamanlayýcýqq.schedule(görev10, 22000, 1);
		
	    TimerTask görev11=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_9.setBackground(Color.RED);
			}
		};zamanlayýcýqq.schedule(görev11, 24000, 1);

	    TimerTask görev12=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_10.setBackground(Color.RED);
			}
		};zamanlayýcýqq.schedule(görev12, 26000, 1);

TimerTask görev12b=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_11.setBackground(Color.RED);
			}
		};zamanlayýcýqq.schedule(görev12b, 28000, 1);
	TimerTask görev13=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_12.setBackground(Color.RED);
			}
		};zamanlayýcýqq.schedule(görev13, 30000, 1);
	TimerTask görev14=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_13.setBackground(Color.RED);
			}
		};zamanlayýcýqq.schedule(görev14, 32000, 1);


	TimerTask görev15=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_14.setBackground(Color.RED);
			}
		};zamanlayýcýqq.schedule(görev15, 34000, 1);
	TimerTask görev16=new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				button_15.setBackground(Color.RED);
				btnb.setVisible(false);
				btnc.setVisible(false);
				btnd.setVisible(false);
				btna.setVisible(false);
				btncekil.setVisible(false);
				btnyuzde.setVisible(false);
				
				JOptionPane.showMessageDialog(null, "Barajý geçtiðiniz için Ödülünüz 1000 TL. Doðru þýk : B ", "Durum", JOptionPane.PLAIN_MESSAGE);
				btn1000.setBackground(Color.GREEN);
			}
		};zamanlayýcýqq.schedule(görev16, 36000, 10000);}


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
	};zamanlayýcýx.schedule(görevz, 180, 10000);
	TimerTask göreva=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			btn3000.setBackground(Color.ORANGE);
		}
	};zamanlayýcýx.schedule(göreva, 210, 10000);
      TimerTask görevb=new TimerTask() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			btn5000.setBackground(Color.ORANGE);
		}
	};zamanlayýcýx.schedule(görevb, 240, 10000);
	
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
}

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
import java.io.File;
import java.util.TimerTask;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.util.Timer;
import java.util.TimerTask;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;

public class Soru3 extends JFrame implements ActionListener {
   int sayi=0;
	private JPanel contentPane;
	private JButton button;

	private JLabel lblBirGnKa; 
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
	private  JButton btna;
	private  JButton btnB;
	private  JButton btnD;
	private  JButton btnC;
	private JButton btn500;
	private JButton btn1000 ;
    private	JButton btn2000 ;
	private JButton btn3000;
	private JButton btn5000;
	private JButton btn7500;
	private JButton btn15000;
	private JButton btnotuz;
	private JButton btn60;
	private JButton btn125 ;
	private JButton btn250 ;
	private JButton btnmilyon;
	private JButton btn0tl;
	private JButton btnbasla;
	private JButton btnsýradaki;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnyuzdeeli;
	private JButton btnTelefonJokeri;
	private  JButton btncekil;
	File surec= new File("C:\\Users\\USER\\Desktop\\surec.WAV");
	File yanlis= new File("C:\\Users\\USER\\Desktop\\yanlis.WAV");
	File secim= new File("C:\\Users\\USER\\Desktop\\siksecim.WAV");
	File gecis= new File("C:\\Users\\USER\\Desktop\\sorugecisi.WAV");
	static Clip clip;
	Timer zamanlayýcýqq=new Timer();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Soru3 frame = new Soru3();
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
	public Soru3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 739, 690);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		 
		 btnyuzdeeli = new JButton("%50 Joker");
		 btnyuzdeeli.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		
		 		btnD.setVisible(false);
		 		btna.setVisible(false);
		 	}
		 });
		 
		  btncekil = new JButton("\u00C7ekil");
		  btncekil.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		  btncekil.setForeground(Color.BLUE);
		  btncekil.setBackground(Color.GRAY);
		btncekil.setVisible(false);
		  btncekil.addActionListener(new ActionListener() {
		 	
			 public void actionPerformed(ActionEvent arg0) {
		 		btna.setVisible(false);
		 		btnB.setVisible(false);
		 		btnbasla.setVisible(false);
		 		btnC.setVisible(false);
		 		btnD.setVisible(false);
		 		zamanlayýcýqq.cancel();
		 		btn0tl.setBackground(Color.GREEN);		 		
		 		btn500.setBackground(Color.GREEN);
		 		btn1000.setBackground(Color.GREEN);
		 		JOptionPane.showMessageDialog(null, "TEBRÝKLER!!! 1000 TL Kazandýnýz. Doðru cevap C", "Durum",JOptionPane.PLAIN_MESSAGE);
		 		Timer zamanlayýcý25=new Timer();
				
				TimerTask görev7=new  TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
					
							btnC.setBackground(Color.ORANGE);
							
							
							
						
					}
				};
				zamanlayýcý25.schedule(görev7, 0, 100000);
				Timer zamanlayýcý66=new Timer();
				TimerTask görev88= new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						//btn500.setBackground(Color.GREEN);
					
						
						btnC.setBackground(Color.GREEN);
						
						
						
						
					}
				}; zamanlayýcý66.schedule(görev88, 1200,250);
				
				
				Timer zamanlayýcý99=new Timer();
				TimerTask görev9=new TimerTask() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
					
						btnC.setBackground(Color.BLACK);

	                           sayi++;
						if(sayi==8){
							zamanlayýcý99.cancel();
						}
					}
				}; zamanlayýcý99.schedule(görev9,1400,250);
		 		
		 		
		 	}
		 });
		 btncekil.setBounds(41, 566, 137, 55);
		 contentPane.add(btncekil);
		 
		 btnTelefonJokeri = new JButton("Telefon Jokeri");
		 btnTelefonJokeri.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		JOptionPane.showMessageDialog(null, "Gerçekten birini aramayacaðýnýzý ikimizde biliyoruz :)", "Uyanýklýk Sezintisi", JOptionPane.PLAIN_MESSAGE);
		 	}
		 });
		 btnTelefonJokeri.setForeground(Color.BLUE);
		 btnTelefonJokeri.setFont(new Font("Tahoma", Font.ITALIC, 11));
		 btnTelefonJokeri.setBackground(Color.CYAN);
		 btnTelefonJokeri.setBounds(467, 75, 105, 55);
		 contentPane.add(btnTelefonJokeri);
		 btnyuzdeeli.setForeground(Color.BLUE);
		 btnyuzdeeli.setFont(new Font("Tahoma", Font.ITALIC, 11));
		 btnyuzdeeli.setBackground(Color.CYAN);
		 btnyuzdeeli.setBounds(363, 75, 90, 55);
		 contentPane.add(btnyuzdeeli);
		
		 button = new JButton("");
		button.setBounds(97, 242, 15, 23);
		contentPane.add(button);
		
		 button_1 = new JButton("");
		button_1.setBounds(130, 242, 15, 23);
		contentPane.add(button_1);
		
		 button_2 = new JButton("");
		button_2.setBackground(SystemColor.inactiveCaption);
		button_2.setBounds(163, 242, 15, 23);
		contentPane.add(button_2);
		
		 button_3 = new JButton("");
		button_3.setBounds(188, 242, 15, 23);
		contentPane.add(button_3);
		
		 button_4 = new JButton("");
		button_4.setBounds(213, 242, 15, 23);
		contentPane.add(button_4);
		
	 button_5 = new JButton("");
		button_5.setBounds(238, 242, 15, 23);
		contentPane.add(button_5);
		
		 button_6 = new JButton("");
		button_6.setBounds(263, 242, 15, 23);
		contentPane.add(button_6);
		
		 button_7 = new JButton("");
		button_7.setBounds(288, 242, 15, 23);
		contentPane.add(button_7);
		
		 button_8 = new JButton("");
		button_8.setBounds(313, 242, 15, 23);
		contentPane.add(button_8);
		
		 button_9 = new JButton("");
		button_9.setBounds(338, 242, 15, 23);
		contentPane.add(button_9);
		
		 button_10 = new JButton("");
		button_10.setBounds(363, 242, 15, 23);
		contentPane.add(button_10);
		
		 button_11 = new JButton("");
		button_11.setBounds(388, 242, 15, 23);
		contentPane.add(button_11);
		
		 button_12 = new JButton("");
		button_12.setBounds(413, 242, 15, 23);
		contentPane.add(button_12);
		
		 button_13 = new JButton("");
		button_13.setBounds(438, 242, 15, 23);
		contentPane.add(button_13);
		
		 button_14 = new JButton("");
		button_14.setBounds(467, 242, 15, 23);
		contentPane.add(button_14);
		
		 button_15 = new JButton("");
		button_15.setBounds(492, 242, 15, 23);
		contentPane.add(button_15);
		
		 btnNewButton = new JButton("");
		btnNewButton.setBounds(47, 242, 15, 23);
		contentPane.add(btnNewButton);
		
		 btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(72, 242, 15, 23);
		contentPane.add(btnNewButton_1);
		
		 btnbasla = new JButton("Ba\u015Fla");
		 btnbasla.setIcon(new ImageIcon("C:\\OGURCU\\resimler\\b4e2aa02_Start-Button.png"));
		 btnbasla.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnbasla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sesCalintro(surec);
				
				lblBirGnKa.setVisible(true);
				btncekil.setVisible(true);
				btna.setVisible(true);
				btnB.setVisible(true);
				btnC.setVisible(true);
				btnD.setVisible(true);
				süre();
				
				
			}
		});
		btnbasla.setBounds(10, 158, 205, 65);
		contentPane.add(btnbasla);
		
		 btnmilyon = new JButton("1000000 TL");
		btnmilyon.setForeground(Color.MAGENTA);
		btnmilyon.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnmilyon.setBackground(Color.BLACK);
		btnmilyon.setBounds(595, 0, 128, 36);
		contentPane.add(btnmilyon);
		
		 btn250 = new JButton("250000TL");
		btn250.setForeground(Color.MAGENTA);
		btn250.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn250.setBackground(Color.BLACK);
		btn250.setBounds(605, 47, 114, 36);
		contentPane.add(btn250);
		
		 btn125 = new JButton("125000 TL");
		btn125.setForeground(Color.MAGENTA);
		btn125.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn125.setBackground(Color.BLACK);
		btn125.setBounds(618, 94, 105, 36);
		contentPane.add(btn125);
		
		 btn60 = new JButton("60000 TL");
		btn60.setForeground(Color.MAGENTA);
		btn60.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn60.setBackground(Color.BLACK);
		btn60.setBounds(618, 141, 105, 36);
		contentPane.add(btn60);
		
		 btnotuz = new JButton("30000 TL");
		btnotuz.setForeground(Color.MAGENTA);
		btnotuz.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnotuz.setBackground(Color.BLACK);
		btnotuz.setBounds(618, 187, 105, 36);
		contentPane.add(btnotuz);
		
		 btn15000 = new JButton("15000 TL");
		btn15000.setForeground(Color.MAGENTA);
		btn15000.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn15000.setBackground(Color.BLACK);
		btn15000.setBounds(618, 243, 105, 36);
		contentPane.add(btn15000);
		
		 btn7500 = new JButton("7500 TL");
		btn7500.setForeground(Color.MAGENTA);
		btn7500.setBackground(Color.BLACK);
		btn7500.setBounds(618, 290, 105, 46);
		contentPane.add(btn7500);
		
		 btn5000 = new JButton("5000 TL");
		btn5000.setForeground(Color.MAGENTA);
		btn5000.setBackground(Color.BLACK);
		btn5000.setBounds(618, 347, 105, 36);
		contentPane.add(btn5000);
		
		 btn3000 = new JButton("3000 TL");
		btn3000.setForeground(Color.MAGENTA);
		btn3000.setBackground(Color.BLACK);
		btn3000.setBounds(618, 398, 105, 36);
		contentPane.add(btn3000);
		
		 btn2000 = new JButton("2000 TL");
		btn2000.setForeground(Color.MAGENTA);
		btn2000.setBackground(Color.BLACK);
		btn2000.setBounds(618, 445, 105, 36);
		contentPane.add(btn2000);
		
		 btn1000 = new JButton("1000 TL");
		btn1000.setForeground(Color.MAGENTA);
		btn1000.setBackground(Color.BLACK);
		btn1000.setBounds(633, 504, 86, 33);
		contentPane.add(btn1000);
		
		 btn500 = new JButton(" 500 TL");
		btn500.setForeground(Color.MAGENTA);
		btn500.setBackground(Color.BLACK);
		btn500.setBounds(637, 559, 76, 23);
		contentPane.add(btn500);
		
		 btn0tl = new JButton(" 0 TL");
		btn0tl.setForeground(Color.MAGENTA);
		btn0tl.setBackground(Color.BLACK);
		btn0tl.setBounds(637, 598, 76, 23);
		contentPane.add(btn0tl);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 300, 505, 83);
		contentPane.add(panel);
		
		 lblBirGnKa = new JLabel("Bir g\u00FCn ka\u00E7 saniyedir ?");
		 lblBirGnKa.setBounds(148, 24, 205, 21);
		lblBirGnKa.setForeground(Color.RED);
		lblBirGnKa.setVisible(false);
		panel.setLayout(null);
		lblBirGnKa.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		panel.add(lblBirGnKa);
		
		btna = new JButton("A) 86000");
		btna.setForeground(Color.BLACK);
		btna.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btna.setBounds(97, 388, 128, 55);
		btna.addActionListener(this);
		btna.setVisible(false);
		contentPane.add(btna);
		
		 btnB = new JButton("B) 88600");
		 btnB.setForeground(Color.BLACK);
		 btnB.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnB.setBounds(300, 388, 128, 55);
		btnB.addActionListener(this);
		btnB.setVisible(false);
		contentPane.add(btnB);
		
		 btnD = new JButton("D) 84800");
		 btnD.setForeground(Color.BLACK);
		 btnD.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnD.setBounds(300, 470, 128, 55);
		btnD.addActionListener(this);
		btnD.setVisible(false);
		contentPane.add(btnD);
		
	    btnC = new JButton("C )86400");
	    btnC.setForeground(Color.BLACK);
	    btnC.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnC.setBounds(97, 482, 128, 55);
		btnC.addActionListener(this);
        btnC.setVisible(false);
         contentPane.add(btnC);
		
		btnsýradaki = new JButton("S\u0131radaki soru");
		btnsýradaki.setBackground(Color.CYAN);
		btnsýradaki.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnsýradaki.setForeground(Color.BLUE);
		btnsýradaki.setBounds(419, 548, 119, 73);
		btnsýradaki.setVisible(false);
		btnsýradaki.addActionListener(this);
		contentPane.add(btnsýradaki);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setIcon(new ImageIcon("C:\\OGURCU\\resimler\\1_d.jpg"));
		lblNewLabel.setBounds(-261, -58, 984, 824);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("K\u0130M M\u0130LYONER OLMAK \u0130STER ?");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_1.setBounds(117, 18, 485, 46);
		contentPane.add(lblNewLabel_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton basýlanbuton=(JButton) e.getSource();
		String butonismi=basýlanbuton.getText();
		
		
		switch (butonismi) {
		case "A) 86000":
			clip.stop();
			sesCalintro(secim);
			
			btnB.setVisible(false);
			btncekil.setVisible(false);
			btnC.setVisible(false);
			btnD.setVisible(false);
			btnyuzdeeli.setVisible(false);
			
			btnbasla.setVisible(false);
			zamanlayýcýqq.cancel();
       REnkler();
			Timer zamanlayýcý2=new Timer();
			
			TimerTask görev3=new  TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
						btna.setBackground(Color.ORANGE);
						
						
						
					
				}
			};
			 zamanlayýcý2.schedule(görev3, 0, 100000);
			TimerTask görev4= new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					clip.stop();
					sesCalintro(yanlis);
					
					
					btna.setBackground(Color.RED);
					
					JOptionPane.showMessageDialog(null, "Barajý geçtiðiniz için Ödülünüz 1000 TL. Doðru þýk : C ", "Durum", JOptionPane.PLAIN_MESSAGE);
					btn1000.setBackground(Color.GREEN);
					
					
				}
			}; zamanlayýcý2.schedule(görev4, 5000, 10000);
			
			btna.setBackground(Color.RED);
			break;

		case "B) 88600":	
			clip.stop();
			sesCalintro(secim);
			btnC.setVisible(false);
			btncekil.setVisible(false);
			btnD.setVisible(false);
			btnyuzdeeli.setVisible(false);
			btna.setVisible(false);
			
			btnbasla.setVisible(false);
			zamanlayýcýqq.cancel();
		       REnkler();
            Timer zamanlayýcý4444 =new Timer();
			TimerTask görev55555=new  TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
						btnB.setBackground(Color.ORANGE);
						
						
						
					
				}
			};
			 zamanlayýcý4444.schedule(görev55555, 0, 100000);
			TimerTask görev6666= new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					clip.stop();
					sesCalintro(yanlis);
					btnB.setBackground(Color.RED);
					
					JOptionPane.showMessageDialog(null, "Barajý geçtiðiniz için Ödülünüz 1000 TL. Doðru þýk : C ", "Durum", JOptionPane.PLAIN_MESSAGE);
					btn1000.setBackground(Color.GREEN);
					
					
				}
			}; zamanlayýcý4444.schedule(görev6666, 5000, 10000);
			
			btnB.setBackground(Color.RED);
			break;
		case "C )86400":
		clip.stop();
			sesCalintro(secim);
			
			btnbasla.setVisible(false);
			btnD.setVisible(false);
			btnyuzdeeli.setVisible(false);
			btna.setVisible(false);
			btnB.setVisible(false);
			btncekil.setVisible(false);
			
			zamanlayýcýqq.cancel();
		       REnkler();
Timer zamanlayýcý25=new Timer();
			
			TimerTask görev7=new  TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
				
						btnC.setBackground(Color.ORANGE);
						
						
						
					
				}
			};
			zamanlayýcý25.schedule(görev7, 0, 100000);
			Timer zamanlayýcý66=new Timer();
			TimerTask görev88= new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					//btn500.setBackground(Color.GREEN);
				
				
					btnC.setBackground(Color.GREEN);
					
					
					
					
				}
			}; zamanlayýcý66.schedule(görev88, 1200,250);
			
			
			Timer zamanlayýcý99=new Timer();
			TimerTask görev9=new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
				
					btnC.setBackground(Color.BLACK);

                           sayi++;
					if(sayi==8){
						zamanlayýcý99.cancel();
					}
				}
			}; zamanlayýcý99.schedule(görev9,1400,250);
			
			Timer zaman5=new Timer();
			TimerTask görevödül=new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					clip.stop();
					sesCalintro(yanlis);
					btn0tl.setBackground(Color.GREEN);
				
					btn500.setBackground(Color.GREEN);
					btn1000.setBackground(Color.GREEN);
					btn2000.setBackground(Color.GREEN);
					btnsýradaki.setVisible(true);
				}
			};zaman5.schedule(görevödül, 1200, 10000);
			
			
		   break;
		case "D) 84800" :
			clip.stop();
			sesCalintro(secim);
			btnbasla.setVisible(false); 
			btnyuzdeeli.setVisible(false);
			btna.setVisible(false);
			btnB.setVisible(false);
			btnC.setVisible(false);
			btncekil.setVisible(false);
			
			
			zamanlayýcýqq.cancel();
		       REnkler();
			Timer z1=new Timer();
           TimerTask görev88888=new  TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
						btnD.setBackground(Color.ORANGE);
						
						
						
					
				}
			};
			 z1.schedule(görev88888, 0, 100000);
			TimerTask görev777777= new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					clip.stop();
					sesCalintro(yanlis);
					btnD.setBackground(Color.RED);
					
					JOptionPane.showMessageDialog(null, "Barajý geçtiðiniz için Ödülünüz 1000 TL. Doðru þýk : C ", "Durum", JOptionPane.PLAIN_MESSAGE);
					btn1000.setBackground(Color.GREEN);
					
					
				}
			}; z1.schedule(görev777777, 5000, 10000);
			
			btnD.setBackground(Color.RED);
			
			break;
		case "Sýradaki soru" :
			clip.stop();
			sesCalintro(gecis);
			Soru4 soru4=new Soru4();
			soru4.setVisible(true);
			
			
			
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
				btnyuzdeeli.setVisible(false);
				btna.setVisible(false);
				btnB.setVisible(false);
				btnC.setVisible(false);
				btnD.setVisible(false);
				btnbasla.setVisible(false);
				btncekil.setVisible(false);
				JOptionPane.showMessageDialog(null, "Barajý geçtiðiniz için Ödülünüz 1000 TL. Doðru þýk : C ", "Durum", JOptionPane.PLAIN_MESSAGE);
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
	};zamanlayýcýx.schedule(görev0, 90, 250);
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
}

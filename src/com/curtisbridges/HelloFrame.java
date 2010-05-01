/**
 * 
 */
package com.curtisbridges;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * @author curtis
 *
 */
@SuppressWarnings("serial")
public class HelloFrame extends JFrame {
	public HelloFrame() {
		super("Hello Swing");
		
		init();
		
		setSize(640, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void init() {
		setJMenuBar(createJMenuBar());
	}
	
	private JMenuBar createJMenuBar() {
		JMenuBar menubar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		
		JMenuItem item = new JMenuItem("Quit");
		item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		fileMenu.add(item);
		menubar.add(fileMenu);
		
		return menubar;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloFrame frame = new HelloFrame();
		
		frame.setVisible(true);
	}
}

package com.ninelivesgaming.roomer.handlers;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

public class InputHandler extends JComponent{
	public InputHandler(){
		//How to add a key listener!
		
		/*
		 * Just change the key stroke you want to capture.
		 */
		getInputMap(WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("A"), "keyA");
		getActionMap().put("keyA", new AbstractAction(){
			@Override
			public void actionPerformed(ActionEvent e) {
				for(KeyStroke k : getInputMap(WHEN_IN_FOCUSED_WINDOW).keys()){
					System.out.println(k.toString() + " A");
				}
			}
		});
		
		getInputMap(WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("S"), "keyS");
		getActionMap().put("keyS", new AbstractAction(){
			@Override
			public void actionPerformed(ActionEvent e) {
				for(KeyStroke k : getInputMap(WHEN_IN_FOCUSED_WINDOW).keys()){
					System.out.println(k.toString() + " S");
				}
			}
		});
	}
	
}

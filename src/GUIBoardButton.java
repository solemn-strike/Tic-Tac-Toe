import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;

public class GUIBoardButton  extends JButton {
	
	private boolean isClicked;
	private int row;
	private int column;
	
	public GUIBoardButton(int row, int column) {
		super();
		isClicked = false;
		this.row = row;
		this.column = column;
		this.setText( "" );
		this.setFont( new Font("Dialog", Font.PLAIN, 60) );
		this.setFocusable(false);
		this.setRolloverEnabled(false);
		this.setBackground(Color.WHITE);
		this.setHorizontalAlignment(JLabel.CENTER);
	}
	
	public int getRow() {
		return row;
	}
	
	public int getColumn() {
		return column;
	}
	
	public boolean isClicked() {
		return isClicked; 
	}
	
	public void markButton(char player) {
		if ( player == TTTEngine.PLAYER_1 )
			this.setForeground(Color.RED);
		else				
			this.setForeground(Color.BLUE);

		this.setText( String.valueOf( player ) );
		setClicked(true);
	}
	
	public void reset() {
		this.setText("");
		this.setEnabled(true);
		isClicked = false;
	}
	
	public void setClicked(boolean bool) { 
		isClicked = bool; 
	}
}

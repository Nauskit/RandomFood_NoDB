import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodPage extends AppGuis implements ActionListener {
    public FoodPage(){
        super("FoodPage");
        addComponentGUI();
        randomFood = new RandomLogic();
    }
    JLabel foodTextRandom;
    RandomLogic randomFood;
    private void addComponentGUI(){

        //FoodtextLabel
        JLabel foodTextLabel = new JLabel("FoodRandom");
        foodTextLabel.setBounds(0,20,540,100);
        foodTextLabel.setFont(new Font("Dialog", Font.BOLD, 28));
        foodTextLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(foodTextLabel);

        //FoodTextRandom
        foodTextRandom = new JLabel("?");
        foodTextRandom.setBounds(40,200,getWidth()-100,200);
        foodTextRandom.setFont(new Font("Dialog", Font.BOLD, 48));
        foodTextRandom.setHorizontalAlignment(SwingConstants.CENTER);
        foodTextRandom.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(foodTextRandom);

        //RandomButton
        JButton randomButton = new JButton("Random Food");
        randomButton.setBounds(40, 500,getWidth()-100,60);
        randomButton.setFont(new Font("Dialog", Font.PLAIN, 20));
        randomButton.setHorizontalAlignment(SwingConstants.CENTER);
        randomButton.addActionListener(this);
        add(randomButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        randomFood.RandomFoodChoice();
        foodTextRandom.setText(randomFood.getComputerChoice());
    }
}

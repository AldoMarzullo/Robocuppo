/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robocup;

/**
 *
 * @author aloisius
 */
public class Message {
    private int time;
    private double direction;
    private String team;
    private int playerSender;
    private String message;
    
    public Message(int time, double direction, String team, int playerSender, String message) {
        this.time = time;
        this.direction = direction;
        this.team = team;
        this.playerSender = playerSender;
        this.message = message;
    }

    public Message() {
        this.time = -1;
        this.direction = Double.NaN;
        this.team = "";
        this.playerSender = -1;
        this.message = "";
		
	}

	public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getPlayerSender() {
        return playerSender;
    }

    public void setPlayerSender(int playerSender) {
        this.playerSender = playerSender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}

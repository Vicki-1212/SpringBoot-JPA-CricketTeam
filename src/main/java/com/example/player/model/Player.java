/*
 * You can use the following import statements
 * import javax.persistence.*;
 * 
 */

// Write your code here
package com.example.player.model;

import javax.persistence.*;

@Entity
@Table(name = "team")
public class Player {

    @Id
    @Column(name = "playerid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int playerId;

    @Column(name = "playername")
    private String playerName;

    @Column(name = "jerseynumber")
    private int jerseyNumber;

    @Column(name = "role")
    private String role;

    public Player() {
    }

    public Player(int playerId, String playerName, int jerseyNumber, String role) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
        this.role = role;
    }

    // Get and Set Method of playerId
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getPlayerId() {
        return this.playerId;
    }

    // Get and Set Method of playerName
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    // Get and Set Method of jerseyNumber
    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public int getJerseyNumber() {
        return this.jerseyNumber;
    }

    // Get and Set Method of role'
    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }
}

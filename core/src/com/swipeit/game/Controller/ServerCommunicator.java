package com.swipeit.game.Controller;

import com.badlogic.gdx.Gdx;

import org.json.JSONException;
import org.json.JSONObject;

import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;

/**
 * Created by marie on 19.03.17.
 */

public class ServerCommunicator {


    /**
     * Connects to the Firebase game server
     */
    public static final String SERVER_URL = "https://swipeit-71dd7.firebaseio.com";
    private Socket socket = null;
    private String id;

    public void connectSocket(){
        try {
            socket = IO.socket(SERVER_URL);
            socket.connect();
        }catch (Exception e){
            System.out.println(e);
        }
    }



    /*public void loadCommunicator() {

        // If the game is not connected to server, it connects.
        if (!socket.connected()) {
            socket.connect();
        }

        //Connection event, where the client connects to the server
        //Emmitter : sends an event to the connected client
        socket.on(Socket.EVENT_CONNECT, socketConfig);
    }*/
    public void configSocketEvents() {

        // If the game is not connected to server, it connects.
        if (!socket.connected()) {
            socket.connect();
        }

        //Connection event, where the client connects to the server
        //Emmitter : sends an event to the connected client
        socket.on(Socket.EVENT_CONNECT, new Emitter.Listener() {
            @Override
            public void call(Object... args) {
                Gdx.app.log("SocketIO", "Connected");
                System.out.println("Connected to socket.");
                System.out.println("Socket id: " + socket.id());
                //createGame.setUnableToConnect(false);
            }
        }).on("socketID", new Emitter.Listener() {
            @Override
            public void call(Object... args) {
                JSONObject data = (JSONObject) args[0];
                try {

                    id = data.getString("id");
                    Gdx.app.log("SocketIO", "My ID: " + id);
                } catch (JSONException e) {
                    Gdx.app.log("SocketIO", "Error getting ID");
                }
            }
        });
    }


    /**
     * Emitter listeners
     */
//    private Emitter.Listener socketConfig = new Emitter.Listener() {
//        @Override
//        public void call(Object... args) {
//            Gdx.app.log("SocketIO", "Connected");
//            System.out.println("Connected to socket.");
//            System.out.println("Socket id: " + socket.id());
//            //createGame.setUnableToConnect(false);
//        }
//    };




    //---------------------------------------------------------------------

    public int getGameKey(){
        //TODO implement server connection
        return 0;
    }

    //try gameKey, if true return opponent ID?
    public int tryGameKey(int gameKey){
        //TODO

        return 0;
    }

    //Send message to other player that the game will start
    public void sendStartSignal(){
        //TODO implement
    }

}

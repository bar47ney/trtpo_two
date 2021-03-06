# Project requirements
---
### Contents
1. [Introduction](#1)
2. [User requirements](#2) <br>
  2.1. [Software interfaces](#2.1) <br>
  2.2. [User interface](#2.2) <br>
  2.3. [User Features](#2.3) <br>
3. [System requirements](#3) <br>
  3.1 [Functional requirements](#3.1) <br>
  3.2 [Non-functional requirements](#3.2) <br>
4. [Project Description](#4) <br>
	4.1 [Game purpose](#4.1) <br>
	4.2 [Rules of the game](#4.2) <br>
	4.3 [Game difficulty](#4.3) <br>
5. [Analogs](#5) <br>

### 1. Introduction <a name="1"></a>
Project ALLigator - single-player arcade game,in which a player has to guess characters using pop-up clues.
Do you like Kit Harington from Winterfell? Do you adore listening to Rihanna and singing along to Kirkorov? Is Buzova your favourite singer? How well do you know them? Can you guess your favourite actor or singer building on facts from their biography?
A Project ALLigator will check you!


### 2. User requirements <a name="2"></a>
#### 2.1. Software interfaces <a name="2.1"></a>
The game is developing in Java.
The information about characters is stored in the SQLite database. The game is provided with intuitive interface developed by JavaFX.

#### 2.2. User interface <a name="2.2"></a>
  
- Main menu

In the main menu a user can register, log in to the account ( if any available ), see the rating of players, the rules of the game and exit the program

![MenuScreen](https://github.com/bar47ney/trtpo_two/blob/master/11.png)
  
- Rating of players

In this window you can see the rating of players - their names and a number of points.
![RaitingScreen](https://github.com/bar47ney/trtpo_two/blob/master/22.png)
  
- Login window

This window authorizes the user.

![SignInScreen](https://github.com/bar47ney/trtpo_two/blob/master/33.png)
  
  - Game window

In this window, the game process actually takes place.
![GamePlayScreen](https://github.com/bar47ney/trtpo_two/blob/master/44.png)

#### 2.3. User Features <a name="2.3"></a>
- The target audience

People of any age who are interested in famous personalities from different spheres of life.

### 3. System requirements <a name="3"></a>
The application is launched and run on Windows.
#### 3.1. Functional requirements <a name="3.1"></a>
The user is provided with the following options:
   1. Authorization (registration and sign in)
   2. View Player Rankings
   3. Saving the result
   4. Character category selection
   5. Adding new categories and characters
   6. View Game Rules
   7. Difficulty selection
   8. Quit the game
   
#### 3.2. Non-functional requirements <a name="3.2"></a>
- The application provides a convenient and intuitive interface using JavaFX
- The ability to play without access to the Internet
- The application is being developed in Java
- Uses SQLite Database

### 4. Project Description <a name="4"></a>
  ##### 4.1 Game purpose <a name="4.1"></a>
Collect the maximum possible number of points and solve all the characters.
  ##### 4.2 Rules of the game <a name="4.2"></a>
  You must register, log in account and start the game. At first the game will choose the character from among the not guessed. If the user is a new player, all available characters for the moment will be downloaded. Next, the game will begin to display on the screen one of characteristic of this character. The more complex is the character, the more difficult is the hint and the less they were displayed on the screen, the more points the player can get. If the player doesn't guess the character in the end, the game leaves this character among the number of not guessed, then the game offers the player two options: continue the game or stop it. If the first option is chosen, the programm will select another character from among the not guessed and the game will continue. If the second option is selected, the game will exit.
 ##### 4.3 Game difficulty <a name="4.3"></a>
 The complexity of the game depends on the character, the hint and the number of hints, which were displayed on the screen.
### 5. Analogs <a name="5"></a>
Application Akinator
Akinator can read your mind and guess the character, which you have in mind, for this it will ask some questions. Think of a real or fictional character, and Akinator will try to guess it.

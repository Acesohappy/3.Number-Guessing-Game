function startGame(){
  const numberToGuess=Math.floor(Math.random()*100)+1;
  let attempts=0;
  let playerGuess=0;

  function getGuess(){
    const playerGuessInput=prompt)"Enter your guess(between 1 and 100):");

    if(playerGuessInput===null){
      alert("Game cancelled.");
      return;
    }

    playerGuess=parseInt(playerGuessInput);

    if(isNull(playerGuess)){
      alert("Please enter a valid number.");
      getGuess();
    }else{
      attempts++;
      checkGuess();
    }
  }

function checkGuess(){
  if(playerGuess < numberToGuess){
    alert("Too low! Try again.");
    getGuess();
  }else if(playerGuess > numberToGuess){
    alert("Too high! Try again.");
    getGuess();
  }else{
    alert(`Congratulations! You've guessed the number in ${attempts} attempts.`);
    askReplay();
  }
}


function askReplay(){
  const playAgain=confirm("Do you want to play again?");
  if(playAgain){
    startGame();
  }else{
    alert("Thanks for playing! GoodBye.");
  }
}
  getGuess();
}
startGame();




  

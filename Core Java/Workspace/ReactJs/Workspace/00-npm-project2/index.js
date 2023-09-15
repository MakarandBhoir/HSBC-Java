console.log('Welcome to npm.')

let colors = ["red", "green", "blue", "yellow", "black", "white"];

/* function declaration */
function print(val) {
    console.log(val);
}

/* function calling */
//print('yellow')


colors.forEach(print); // whatever number elements present in colors 
                        // that many no of times will call print function

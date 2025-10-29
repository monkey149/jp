// there are two code, copy any one you like

// 1.
// import React, {useState} from 'react';
// import './App.css';
// function App(){
//   const [selectedcolor,setSelectedcolor] = useState('');

//   const buttonClick = (color) => {
//     setSelectedcolor(color);
//   };
//   return (
//     <div>
//       <div>
//         <h1>Select the color</h1>
//         <button className ='red' onClick = {
//           () => buttonClick('red')
//         }>red</button>
//         <button className ='yellow' onClick = {
//           () => buttonClick('yellow')
//         }>yellow</button>
//         <button className ='green' onClick = {
//           () => buttonClick('green')
//         }>green</button>
//         <button className ='blue' onClick = {
//           () => buttonClick('blue')
//         }>blue</button>
//         </div>
//         {
//           selectedcolor && (
//             <p>You selected {selectedcolor} </p>
//           )
//         }
//       </div>
//   );
// }
// export default App;


// this is App.css
// #root {
//   max-width: 1280px;
//   margin: 0 auto;
//   padding: 2rem;
//   text-align: center;
// }

// .logo {
//   height: 6em;
//   padding: 1.5em;
//   will-change: filter;
//   transition: filter 300ms;
// }
// .logo:hover {
//   filter: drop-shadow(0 0 2em #646cffaa);
// }
// .logo.react:hover {
//   filter: drop-shadow(0 0 2em #61dafbaa);
// }

// @keyframes logo-spin {
//   from {
//     transform: rotate(0deg);
//   }
//   to {
//     transform: rotate(360deg);
//   }
// }

// @media (prefers-reduced-motion: no-preference) {
//   a:nth-of-type(2) .logo {
//     animation: logo-spin infinite 20s linear;
//   }
// }

// .card {
//   padding: 2em;
// }

// .read-the-docs {
//   color: #888;
// }

// .red{
//   background-color: red;
// }

// .blue{
//   background-color: blue;
// }

// .green{
//   background-color: green;
// }

// .yellow{
//   background-color: yellow;
// }

// 2.
import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() { 
  const [selectedColor, setSelectedColor] = useState(''); 
  const handleColorClick = (color) => { 
    setSelectedColor(color); 
  }; 
  return ( 
    <div style={{ textAlign: 'center', marginTop: '50px' }}> 
      <h2>Select a Color</h2> 
      <div style={{ marginBottom: '20px' }}> 
        <button onClick={() => handleColorClick('Red')} style={{ margin: '5px',backgroundColor: 'red', color: 'white', padding: '10px 20px' }}>Red</button> 
        <button onClick={() => handleColorClick('Blue')} style={{ margin: '5px', backgroundColor: 'blue', color: 'white', padding: '10px 20px' }}>Blue</button> 
        <button onClick={() => handleColorClick('Green')} style={{ margin: '5px', backgroundColor: 'green', color: 'white', padding: '10px 20px' }}>Green</button> 
        <button onClick={() => handleColorClick('Yellow')} style={{ margin: '5px', backgroundColor: 'gold', color: 'black', padding: '10px 20px' }}>Yellow</button> 
      </div> 
      {selectedColor && ( 
        <h3>You have selected <span style={{ color: selectedColor.toLowerCase() }}>{selectedColor}</span>.</h3> 
      )} 
    </div> 
  );} 
export default App;

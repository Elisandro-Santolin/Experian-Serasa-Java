import{useState} from 'react';
export default function MyButton({name}) {
    
    function handleClick(){
        alert(name+" Utilizou esse Botão");
    }
    return(
      <button onClick={handleClick}>Click Me!</button>
    );
  }

  export function ButtonCounter() {

    const [count, setCount] = useState(0);

    function handleCounter(){
        setCount(count + 3);

    }
    return(
        <button onClick={handleCounter}>Contator: {count}</button>
      );
}
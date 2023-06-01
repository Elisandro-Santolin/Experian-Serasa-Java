import { useState } from 'react';
import './App.css';
import MyButton, {ButtonCounter, SharedCounter} from './MyButton';
import Moldura from './Moldura';

function App() {

  let name = "Flávinho do Pneu";

  const [counter, setCounter] = useState(0);

  function handleCounter(){
    setCounter(counter + 1);
  }

  return (
    <>
      <p className="teste">{name}</p>

      <MyButton name={true}/>
      <MyButton />

      <br/>
      <p>Contadores Individuais</p>

      <ButtonCounter/>
      <ButtonCounter/>

      <br/>
      <p>Contadores Compartilhados</p>

      <SharedCounter count={counter} handleCounterProps={handleCounter}/>
      <SharedCounter count={counter} handleCounterProps={handleCounter}/>
      <SharedCounter count={counter} handleCounterProps={handleCounter}/>
      <SharedCounter count={counter} handleCounterProps={handleCounter}/>


      <Moldura>
        <h2>Dentro da Moldura</h2>
      </Moldura>
    </>
  );
}

export default App;

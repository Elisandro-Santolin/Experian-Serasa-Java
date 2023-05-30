import './App.css';
import MyButton, {ButtonCounter} from './MyBottom';

function App() {

  let name = "Flávinho do Pneu";
  const myBoolean = true;

  const compras = ["Repolho", "Tomate", "Melão", "Mamão"];

  const listaCompras = compras.map(item => 
    <li key={item}>
      {item}
    </li>
  );

  if(myBoolean){
    name = "Jhon";
  } else{
    name = "Fred";
  }

  return (
    <>
      <p className="teste">{name}</p>
      <MyButton name = {name}/>
      <MyButton name = {"Ninguem"}/>
      <br/>
      <ButtonCounter/>

      {myBoolean ? (<h1>Verdadeiro</h1>) : (<h1>Falso</h1>)}

      <ul>
        {listaCompras}
      </ul>
    </>
  );
}

export default App;

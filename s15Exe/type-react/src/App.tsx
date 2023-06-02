import { useState } from 'react';
import './App.css';
import MyButton from './MyButton';
import Mytable, { Student } from './MyTable';


const studentList: Student[]= [
  {name:"name1", age:31, email:"email1@email.com", degree:"Associate"},
  {name:"name2", age:32, email:"email2@email.com", degree:"Doctoral"},
  {name:"name3", age:33, email:"email3@email.com", degree:"Associate"},
  {name:"name4", age:34, email:"email4@email.com", degree:"Master"},
  {name:"name5", age:35, email:"email5@email.com", degree:"Associate"},
  {name:"name6", age:36, email:"email6@email.com", degree:"Doctoral"},
  {name:"name7", age:37, email:"email7@email.com", degree:"Bachelor"},
];

function App() {
  const [myState, setMyState] = useState<Student | string>();

  function handleClick(){
    alert("Botão clicado");
    setMyState(studentList[0]);

  }

  return (
    <>
      <p>Meu App</p>
      <MyButton name={'Botão'} type={'button'} onClick={handleClick} />
      <Mytable studentList={studentList} />
    </>
  );
}

export default App;

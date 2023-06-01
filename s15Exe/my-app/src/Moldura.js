import './App.css';

export default function Moldura({children}){ //children Props padrão filho
    function clickAlert(){
        alert("Você clicou dentro da moldura");
    }
    return(
        <div onClick={clickAlert} className='moldura'>
            {children}
        </div>
    );
}
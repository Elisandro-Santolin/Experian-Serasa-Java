import TabelaProdutos from "./TabelaProdutos";

export default function Estoque({produtos}){

    return(
        <>
            <p>Componentes Estoque</p>
            <BarraPesquisa/>
            <TabelaProdutos produtos={produtos}/>
        </>
    );
}

function BarraPesquisa(){
    return(
        <form>  
            <input 
                type="text" 
                placeholder="Pesquisar">
            </input> 
            <label>
                <input type="checkbox"> 
                </input>
                    Somente mostrar produtos em estoque
            </label>   
        </form>
    );
}
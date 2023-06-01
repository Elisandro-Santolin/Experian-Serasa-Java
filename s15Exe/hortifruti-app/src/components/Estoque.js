import TabelaProdutos from "./TabelaProdutos";
import {useState} from 'react';

export default function Estoque({produtos}) {

    const [filtro, setFiltro] = useState("");
    const [somenteEstoque, setSomenteEstoque] = useState(false);

    return(
        <>
            <BarraPesquisa 
                filtro={filtro} 
                aoModificarFiltro={setFiltro}
                somenteEstoque={somenteEstoque}
                aoModificarEstoque={setSomenteEstoque}
            />
            <TabelaProdutos 
                produtos={produtos} 
                filtro={filtro}
                somenteEstoque={somenteEstoque}
            />
        </>
    );
}

function BarraPesquisa({filtro, somenteEstoque, aoModificarFiltro, aoModificarEstoque}){
    return(
        <form>
        <input
            type="text" 
            placeholder="Pesquisar..."
            value={filtro}
            onChange={(e) => aoModificarFiltro(e.target.value)}
        />
        <label>
            <input
                type="checkbox"
                checked={somenteEstoque}
                onChange={(e) => aoModificarEstoque(e.target.checked)}
            />
            Somente mostrar produtos em estoque
        </label>
        </form>
    );
}
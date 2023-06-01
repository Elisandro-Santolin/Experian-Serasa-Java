export default function TabelaProdutos({produtos}) {
   
   const listarProdutos = produtos.map(produto =>
        <ProdutoTableRow produto={produto} key={produto.name}/>
    );
 
    return(
        <table>
           {listarProdutos}
        </table>
    );
}

function ProdutoTableRow({produto}){
    return(
        <tr>
            [produto.stocked ? <td>{produto.name}</td> :<td style={{ color: 'red' }} >{produto.name}]</td>
            <td>{produto.price}</td>
        </tr>
    );
}
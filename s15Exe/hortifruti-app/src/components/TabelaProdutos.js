export default function TabelaProdutos({produtos, filtro, somenteEstoque}) {

    const listarProdutos = [];
    
    produtos.forEach((produto) => {
        //se o nome do produto não conter a string filtro, o loop retorna sem fazer nada
        if(produto.name.toLowerCase().indexOf(filtro.toLowerCase()) === -1){
            return;
        }

        //Se a opção de somente estoque for verdadeira, e o produto não estiver em estoque, o loop retorna sem fazer nada
        if(somenteEstoque && !produto.stocked){
            return;
        }

        //Em caso do produto não ser filtrado nas condicionais acima,um ProdutoTableRow é adicionado na lista de produtos
        listarProdutos.push(<ProdutoTableRow key={produto.name} produto={produto} />)

    });

    return(
        <table>
            <tr>
                <th>Nome</th>
                <th>Categoria</th>
                <th>Preço</th>
                <th>Estoque</th>
            </tr>
            {listarProdutos}
        </table>
    );
}

function ProdutoTableRow({produto}){

    if(produto.stocked){
        return(
            <tr>
                <td>{produto.name}</td> 
                <td>{produto.category}</td>
                <td>{produto.price}</td>
                <td>Em estoque</td>
            </tr>
        );
    } else {
        return(
            <tr style={{ color: 'red' }}>
                <td>{produto.name}</td> 
                <td>{produto.category}</td>
                <td>{produto.price}</td>
                <td>Em falta</td>
            </tr>
        );
    }
}
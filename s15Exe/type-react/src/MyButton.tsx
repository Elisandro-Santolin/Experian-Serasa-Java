// type MyButtonProps = {
    interface MyButtonProps {
        name: string;
        type: "button" | "submit" | "reset";
        className?: string;
        // className: string | undefined;
        onClick: React.MouseEventHandler<HTMLButtonElement>;
    }
    
    
    export default function MyButton(props: MyButtonProps){
        return(
            <button onClick={props.onClick} className={props.className} type={props.type}>{props.name}</button>
        );
    }
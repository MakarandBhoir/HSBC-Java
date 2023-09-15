function Header(props) {
    /*
    JSX: JavaScript XML... which need to be converted into JavaScript code
    which will be converted by Bable Compiler.
    1. JSX is case sensitive.
    2. There must be closing tag for every opening tag.
    3. There must be only one root tag.
    4. All the attribute should follow camel case.
    */
    return (
        <div className="jumbotron">
            <h1 className="display-4">{props.title}</h1>
            <p className="lead">{props.desc}</p>
            <hr className="my-4" />
            <p>{props.desc}</p>
        </div>
    );
}
export default Header;
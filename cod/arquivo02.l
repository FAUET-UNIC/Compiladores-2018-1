int n;
string nome;
boolean naoTerminou;
final MAXITER=10;
int nome = 5;
/*identificador ja declarado*/
begin
  write,"Digite seu nome ";
  readln,nome;
  naoTerminou=TRUE;
  n=0;
  while naoTerminou begin
    writeln,"Ola' ",nome;
    n=n+1;
    naoTerminou=n<MAXITER;
  end
end
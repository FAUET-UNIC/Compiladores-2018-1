/* Exemplo de Programa na linguagem L */

int n;
string nome;
boolean naoTerminou;
final MAXITER=10;

begin
  write,"Digite seu nome: ";
  readln,nome;
  naoTerminou=TRUE;
  n=0;
  if naoTerminou begin
    writeln,"Ola' ",nome;
    n=n+1;
    naoTerminou=n<MAXITER;
  end; else n=1;
end
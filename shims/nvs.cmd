@echo off
setlocal enabledelayedexpansion
set args=%*
:: replace problem characters in arguments
set args=%args:"='%
set args=%args:(=`(%
set args=%args:)=`)%
set invalid="='
if !args! == !invalid! ( set args= )
powershell -noprofile -ex unrestricted "& 'C:\Users\gauth\Cours\M1\DevLogAv\02_projet\apps\nvs\current\nvs.ps1'  %args%;exit $lastexitcode"

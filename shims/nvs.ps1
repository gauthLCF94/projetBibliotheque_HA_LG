if (!(Test-Path Variable:PSScriptRoot)) { $PSScriptRoot = Split-Path $MyInvocation.MyCommand.Path -Parent }
$path = join-path "$psscriptroot" "..\apps\nvs\current\nvs.ps1"
if($myinvocation.expectingInput) { $input | & $path  @args } else { & $path  @args }

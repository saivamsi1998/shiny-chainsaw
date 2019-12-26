filetype off
set rtp+=~/.vim/bundle/Vundle.Vim
call vundle#begin('~/.vim/bundle/')"
Plugin 'VundleVim/Vundle.Vim'
"vim customization
Plugin 'morhetz/gruvbox'
Plugin 'ryanoasis/vim-devicons'
Plugin 'vim-airline/vim-airline'
"tpope
Plugin 'tpope/vim-surround'
Plugin 'tpope/vim-fugitive'
Plugin 'tpope/vim-unimpaired'
"vim code movement and management
Plugin 'terryma/vim-multiple-cursors'
Plugin 'easymotion/vim-easymotion'
Plugin 'scrooloose/nerdcommenter'
Plugin 'vimwiki/vimwiki'
Plugin 'jiangmiao/auto-pairs'
"file management
Plugin 'scrooloose/nerdtree'
Plugin 'junegunn/fzf'
Plugin 'mileszs/ack.vim'   
"vim buffer management
Plugin 'maxbrunsfeld/vim-yankstack'
"auto complete
Plugin 'SirVer/ultisnips'
Plugin 'honza/vim-snippets'
Plugin 'tenfyzhong/CompleteParameter.vim'
Plugin 'Valloric/YouCompleteMe'
call vundle#end()
filetype plugin indent on
set nu
"set ruler
set tabstop=2
autocmd StdinReadPre * let s:std=1
autocmd StdinReadPre * let s:std_in=1
syntax enable




"general settings
set relativenumber
set background=dark
set wildmenu
set path+=**
set wildmode=list:full
set autoread
set autowrite
set whichwrap+=<,>,h,l,[,]
set completeopt=menu,menuone
" Limit popup menu height
set pumheight=20



"cursor shape
if has("autocmd")
  au VimEnter,InsertLeave * silent execute '!echo -ne "\e[2 q"' | redraw!
  au InsertEnter,InsertChange *
    \ if v:insertmode == 'i' | 
    \   silent execute '!echo -ne "\e[6 q"' | redraw! |
    \ elseif v:insertmode == 'r' |
    \   silent execute '!echo -ne "\e[4 q"' | redraw! |
    \ endif
  au VimLeave * silent execute '!echo -ne "\e[ q"' | redraw!
endif


"omni-completion
filetype plugin on
set omnifunc=syntaxcomplete#Complete



"you complete me
"let g:ycm_key_select_completion='<Tab>'
let g:ycm_key_list_select_completion = ['<Down>']
let g:ycm_add_preview_to_completeopt = 0 
let g:ycm_autoclose_preview_window_after_completion = 1
set backspace=indent,eol,start


"ultisnips
let  g:UltiSnipsExpandTrigger      = '<tab>'
let  g:UltiSnipsListSnippets       = '<c-tab>'
let  g:UltiSnipsJumpForwardTrigger = '<tab>'
let  g:UltiSnipsJumpBackwardTrigger= '<s-tab>'

"complete parameter
let g:complete_parameter_use_ultisnips_mapping = 1

let g:AutoPairs = {'[':']', '{':'}',"'":"'",'"':'"', '`':'`'}
inoremap <buffer><silent> ) <C-R>=AutoPairsInsert(')')<CR>
nmap <tab> <Plug>(complete_parameter#goto_next_parameter)
imap <tab> <Plug>(complete_parameter#goto_next_parameter)
smap <tab> <Plug>(complete_parameter#goto_next_parameter)
nmap <S-tab> <Plug>(complete_parameter#goto_previous_parameter)
imap <S-tab> <Plug>(complete_parameter#goto_previous_parameter)
smap <S-tab> <Plug>(complete_parameter#goto_previous_parameter)

"move lines up and down
nnoremap <A-Down> :m .+1<CR>==
nnoremap <A-Up> :m .-2<CR>==
vnoremap <A-Down> :m '>+1<CR>gv=gv
vnoremap <A-Up> :m '<-2<CR>gv=gv
inoremap <A-Down> <Esc>:m .+1<CR>==gi
inoremap <A-Up> <Esc>:m .-2<CR>==gi


"colorscheme
let g:gruvbox_italic=1
let g:gruvbox_termcolors=3
colorscheme	gruvbox




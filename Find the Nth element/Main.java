#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node* next;
};
struct node *head=NULL;
struct node *last;
int n;
int y;
int u;
void insert();
void search();
void main()
{
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        insert();
    }
    search();
}

void search()
{
    struct node *temp;
    temp=head;
  scanf("%d",&y);
  if(y>n)
  {
     printf("No node found");
  }
  
    else
    {
    u=(n-y)+1;
    for(int i=1;i<u;i++)
    {
        temp=temp->next;
    }
    printf("%d",temp->data);
    }
}

void insert()
{
    struct node *ptr;
    ptr=(struct node*)malloc(sizeof(struct node*));
    int x;
    scanf("%d",&x);
    ptr->data=x;
    ptr->next=head;
    head=ptr;
}